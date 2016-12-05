package apc.entjava.productandsalesreport.dao;

import apc.entjava.productandsalesreport.businesslogic.SalesAndProductReport;
import apc.entjava.productandsalesreport.model.Expense;
import apc.entjava.productandsalesreport.model.Product;
import apc.entjava.productandsalesreport.model.Sale;
import apc.entjava.productandsalesreport.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by Renzo on 21/11/2016.
 */
public class SalesAndProduct implements SalesAndProductReport{
    private EntityManagerFactory emf;

    public SalesAndProduct() {
        emf =  Persistence.createEntityManagerFactory("ProductSalesDB");
    }

    @Override
    public List<User> listUser(int userId){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin(); //requirement


        List<User> users = em.createQuery("select u from User u where u.userId = :userId", User.class)
                .setParameter("userId", userId)
                .getResultList();

        em.getTransaction().commit();
        em.close();

        return users;

        /*User user = em.createQuery("select u from User u where u.id = :id", User.class)
                .setParameter("id", id)
                .getSingleResult();

        em.getTransaction().commit();
        em.close();

        return user;*/
    }

    /*@Override
    public Sale addSale(int id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Sale sale = em.createQuery("INSERT INTO Sale (saleId, saleDate, saleGrossSales, saleBread, saleGrocery, saleEload, saleSmart, saleGlobe, saleSun)" +
                                   "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)"; //may error pa

        em.getTransaction().commit();
        em.close();
        return null;
    }

    @Override
    public List<Sale> listSale(int id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        List<Sale> sales = em.createQuery("select s from Sale s where s.saleId = :saleId", Sale.class)
                .setParameter("saleId", id)
                .getResultList();

        em.getTransaction().commit();
        em.close();
        return null;
    }

    @Override
    public Product addProduct(int id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        em.getTransaction().commit();
        em.close();
        return null;
    }

    @Override
    public List<Product> listProduct(int id) {
        return null;
    }

    @Override
    public Expense addExpense(int id) {
        return null;
    }

    @Override
    public List<Expense> listExpense(int id) {
        return null;
    }
*/

    @Override
    public User login(String userUsername, String userPassword) {
        EntityManager em = emf.createEntityManager();
        User user = null;
        em.getTransaction().begin();
        try{
            user = em.createQuery("select u from User u where u.userUsername = :userUsername and u.userPassword = :userPassword", User.class)
                    .setParameter("userUsername", userUsername)
                    .setParameter("userPassword", userPassword)
                    .getSingleResult();
            em.getTransaction().commit();
        }finally {
            em.close();
        }
        return user;
    }

    public void register(User newUser){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try{
            em.persist(newUser);
            em.getTransaction().commit();
        }catch (Exception e){
            em.getTransaction().rollback();
        }
        em.close();
    }

}

package apc.entjava.productandsalesreport.dao;

import apc.entjava.productandsalesreport.businesslogic.SalesAndProductReport;
import apc.entjava.productandsalesreport.model.Expense;
import apc.entjava.productandsalesreport.model.Product;
import apc.entjava.productandsalesreport.model.Sale;
import apc.entjava.productandsalesreport.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Renzo on 21/11/2016.
 */
public class SalesAndProduct implements SalesAndProductReport{
    private EntityManagerFactory emf;

    public SalesAndProduct() {
        emf =  Persistence.createEntityManagerFactory("ProductSalesDB");
    }

    @Override
    public User findUser(int id){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin(); //requirement

        User user = em.createQuery("select u from User u where u.id = :id", User.class)
                .setParameter("id", id)
                .getSingleResult();

        em.getTransaction().commit();
        em.close();

        return user;
    }

    @Override
    public Sale addSale(int id) {
        return null;
    }

    @Override
    public Sale findSale(int id) {
        return null;
    }

    @Override
    public Product addProduct(int id) {
        return null;
    }

    @Override
    public Product findProduct(int id) {
        return null;
    }

    @Override
    public Expense addExpense(int id) {
        return null;
    }

    @Override
    public Expense findExpense(int id) {
        return null;
    }
}

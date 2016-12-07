package apc.entjava.productandsalesreport.dao;

import apc.entjava.productandsalesreport.businesslogic.SalesAndProductReport;
import apc.entjava.productandsalesreport.model.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;


public class SalesAndProduct implements SalesAndProductReport{
    private EntityManagerFactory emf;

    public SalesAndProduct() {
        emf =  Persistence.createEntityManagerFactory("ProductSalesDB");
    }

    @Override
    public void register(User newUser) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try{
            em.persist(newUser);
            em.getTransaction().commit();
        } catch (Exception e){
            em.getTransaction().rollback();
        }
        em.close();
    }

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
        } catch (Exception e){
            em.getTransaction().rollback();
        }
        em.close();
        return user;
    }

    @Override
    public List<Category> getCategories() {
        EntityManager em = emf.createEntityManager();
        try{
            em.getTransaction().begin();
            List<Category> categories =
                    em.createQuery("from Category", Category.class).getResultList();
            em.getTransaction().commit();
            em.close();
            return categories;
        }catch (Exception e){
            em.getTransaction().rollback();
            em.close();
            return null;
        }
    }

    @Override
    public List<Sale> getSales() {
        EntityManager em = emf.createEntityManager();
        try{
            em.getTransaction().begin();
            List<Sale> sales =
                    em.createQuery("from Sale", Sale.class).getResultList();
            em.getTransaction().commit();
            em.close();
            return sales;
        }catch (Exception e){
            em.getTransaction().rollback();
            em.close();
            return null;
        }
    }

    @Override
    public List<Product> getProducts() {
        EntityManager em = emf.createEntityManager();
        try{
            em.getTransaction().begin();
            List<Product> products =
                    em.createQuery("from Product ", Product.class).getResultList();
            em.getTransaction().commit();
            em.close();
            return products;
        }catch (Exception e){
            em.getTransaction().rollback();
            em.close();
            return null;
        }
    }

    @Override
    public List<Expense> getExpenses() {
        EntityManager em = emf.createEntityManager();
        try{
            em.getTransaction().begin();
            List<Expense> expenses =
                    em.createQuery("from Expense", Expense.class).getResultList();
            em.getTransaction().commit();
            em.close();
            return expenses;
        }catch (Exception e){
            em.getTransaction().rollback();
            em.close();
            return null;
        }
    }


}

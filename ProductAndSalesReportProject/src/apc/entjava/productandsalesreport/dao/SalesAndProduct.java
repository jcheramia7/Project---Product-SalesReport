package apc.entjava.productandsalesreport.dao;

import apc.entjava.productandsalesreport.businesslogic.SalesAndProductReport;
import apc.entjava.productandsalesreport.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;


public class SalesAndProduct implements SalesAndProductReport{
    private EntityManagerFactory emf;

    public SalesAndProduct() {
        emf =  Persistence.createEntityManagerFactory("ProductSalesDB");
    }

   /* @Override
    public List<User> listUser(int userId){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin(); //requirement


        List<User> users = em.createQuery("select u from User u where u.userId = :userId", User.class)
                .setParameter("userId", userId)
                .getResultList();

        em.getTransaction().commit();
        em.close();

        return users;

    }*/

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
            user = em.createQuery("select  u from User u where u.userUsername = :userUsername and u.userPassword = :userPassword", User.class)
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


}

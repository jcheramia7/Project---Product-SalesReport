package apc.entjava.productandsalesreport.dao;

import apc.entjava.productandsalesreport.businesslogic.UserService;
import apc.entjava.productandsalesreport.model.User;

import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class UserDao implements UserService {
    private EntityManagerFactory emf;

    public UserDao() {
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


}

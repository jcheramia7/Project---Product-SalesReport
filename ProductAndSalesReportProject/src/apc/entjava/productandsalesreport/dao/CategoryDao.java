package apc.entjava.productandsalesreport.dao;

import apc.entjava.productandsalesreport.businesslogic.CategoryService;
import apc.entjava.productandsalesreport.model.Category;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

import static sun.management.Agent.error;

public class CategoryDao implements CategoryService {
    private EntityManagerFactory emf;

    public CategoryDao() {
        emf = Persistence.createEntityManagerFactory("ProductSalesDB");
    }

    @Override
    public void addCategory(Category newCategory) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try{
            em.persist(newCategory);
            em.getTransaction().commit();
        }catch (Exception e){
            em.getTransaction().rollback();
        }
        em.close();
    }

    @Override
    public void remove(Category categoryId) {
        EntityManager em = emf.createEntityManager();
        try{
            em.getTransaction().begin();
            categoryId = em.find(categoryId.getClass(), categoryId.getCategoryId());
            em.remove(categoryId);
            em.flush();
            em.getTransaction().commit();
        }catch (Exception e){
            error("Unable to delete" + categoryId.toString());
        }finally {
            if(em.getTransaction().isActive()) em.getTransaction().rollback();
            em.close();
        }
    }

    @Override
    public void update(Category categoryName) {
        EntityManager em = emf.createEntityManager();

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


}

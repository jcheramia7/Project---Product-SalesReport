package apc.entjava.productandsalesreport.dao;

import apc.entjava.productandsalesreport.businesslogic.CategoryService;
import apc.entjava.productandsalesreport.model.Category;
import apc.entjava.productandsalesreport.model.Sale;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

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

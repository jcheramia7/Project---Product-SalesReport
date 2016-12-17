package apc.entjava.productandsalesreport.dao;

import apc.entjava.productandsalesreport.businesslogic.ProductService;
import apc.entjava.productandsalesreport.model.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

import static sun.management.Agent.error;

/**
 * Created by student on 12/8/2016.
 */
public class ProductDao implements ProductService {
    private EntityManagerFactory emf;

    public ProductDao() {
        emf = Persistence.createEntityManagerFactory("ProductSalesDB");
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
    public void remove(Product productId) {
        EntityManager em = emf.createEntityManager();
        try{
            em.getTransaction().begin();
            productId = em.find(productId.getClass(), productId.getProductId());
            em.remove(productId);
            em.flush();
            em.getTransaction().commit();
        }catch (Exception e){
            error("Unable to delete" + productId.toString());
        }finally {
            if(em.getTransaction().isActive()) em.getTransaction().rollback();
            em.close();
        }
    }

    @Override
    public void addProduct(Product newProduct) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try{
            em.persist(newProduct);
            em.getTransaction().commit();
        }catch (Exception e){
            em.getTransaction().rollback();
        }
        em.close();
    }
}

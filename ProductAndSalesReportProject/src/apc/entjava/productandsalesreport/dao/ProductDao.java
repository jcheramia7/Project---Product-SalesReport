package apc.entjava.productandsalesreport.dao;

import apc.entjava.productandsalesreport.businesslogic.ProductService;
import apc.entjava.productandsalesreport.model.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

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

package apc.entjava.productandsalesreport.dao;

import apc.entjava.productandsalesreport.businesslogic.SaleService;
import apc.entjava.productandsalesreport.model.Sale;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

import static sun.management.Agent.error;

public class SaleDao implements SaleService {
    private EntityManagerFactory emf;

    public SaleDao() {
        emf = Persistence.createEntityManagerFactory("ProductSalesDB");
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
    public void remove(Sale saleId) {
        EntityManager em = emf.createEntityManager();
        try{
            em.getTransaction().begin();
            saleId = em.find(saleId.getClass(), saleId.getSaleId());
            em.remove(saleId);
            em.flush();
            em.getTransaction().commit();
        }catch (Exception e){
            error("Unable to delete" + saleId.toString());
        }finally {
            if(em.getTransaction().isActive()) em.getTransaction().rollback();
            em.close();
        }
    }

    @Override
    public void addSale(Sale newSale) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try{
            em.persist(newSale);
            em.getTransaction().commit();
        }catch (Exception e){
            em.getTransaction().rollback();
        }
        em.close();
    }
}

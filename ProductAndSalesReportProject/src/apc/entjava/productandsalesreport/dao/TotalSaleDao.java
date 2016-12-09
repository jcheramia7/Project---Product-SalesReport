package apc.entjava.productandsalesreport.dao;

import apc.entjava.productandsalesreport.businesslogic.TotalSaleService;
import apc.entjava.productandsalesreport.model.TotalSale;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by johan on 09/12/2016.
 */
public class TotalSaleDao implements TotalSaleService {
    private EntityManagerFactory emf;

    public TotalSaleDao() {
        emf = Persistence.createEntityManagerFactory("ProductSalesDB");
    }

    @Override
    public List<TotalSale> getTotalSales() {
        EntityManager em = emf.createEntityManager();
        try{
            em.getTransaction().begin();
            List<TotalSale> totalSales =
                    em.createQuery("from TotalSale", TotalSale.class).getResultList();
            em.getTransaction().commit();
            em.close();
            return totalSales;
        }catch (Exception e){
            em.getTransaction().rollback();
            em.close();
            return null;
        }
    }
}

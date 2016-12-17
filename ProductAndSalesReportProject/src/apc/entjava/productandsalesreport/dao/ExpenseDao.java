package apc.entjava.productandsalesreport.dao;
import apc.entjava.productandsalesreport.businesslogic.ExpenseService;
import apc.entjava.productandsalesreport.model.Expense;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

import static sun.management.Agent.error;

/**
 * Created by student on 12/8/2016.
 */
public class ExpenseDao implements ExpenseService {
    private EntityManagerFactory emf;

    public ExpenseDao() {
        emf = Persistence.createEntityManagerFactory("ProductSalesDB");
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
	
	@Override
    public void remove(Expense expenseId) {
        EntityManager em = emf.createEntityManager();
        try{
            em.getTransaction().begin();
            expenseId = em.find(expenseId.getClass(), expenseId.getExpenseId());
            em.remove(expenseId);
            em.flush();
            em.getTransaction().commit();
        }catch (Exception e){
            error("Unable to delete" + expenseId.toString());
        }finally {
            if(em.getTransaction().isActive()) em.getTransaction().rollback();
            em.close();
        }
    }

    @Override
    public void addExpense(Expense newExpense) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try{
            em.persist(newExpense);
            em.getTransaction().commit();
        }catch (Exception e){
            em.getTransaction().rollback();
        }
        em.close();
    }
}

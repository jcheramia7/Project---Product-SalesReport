package apc.entjava.productandsalesreport.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class TotalSale implements Serializable{
    private Sale saleId;
    private Expense expenseId;

    public TotalSale() {
    }

    public TotalSale(Sale saleId, Expense expenseId) {
        this.saleId = saleId;
        this.expenseId = expenseId;
    }

    @Id
    @ManyToOne
    public Sale getSaleId() {
        return saleId;
    }

    public void setSaleId(Sale saleId) {
        this.saleId = saleId;
    }

    @Id
    @ManyToOne
    public Expense getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(Expense expenseId) {
        this.expenseId = expenseId;
    }
}

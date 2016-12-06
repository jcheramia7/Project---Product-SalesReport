package apc.entjava.productandsalesreport.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class TotalSale implements Serializable{
    private int totalSaleId;
    private Sale sale;
    private Expense expense;

    public TotalSale() {
    }

    public TotalSale(int totalSaleId, Sale sale, Expense expense) {
        this.totalSaleId = totalSaleId;
        this.sale = sale;
        this.expense = expense;
    }

    @Id
    public int getTotalSaleId() {
        return totalSaleId;
    }

    public void setTotalSaleId(int totalSaleId) {
        this.totalSaleId = totalSaleId;
    }

    @ManyToOne
    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    @ManyToOne
    public Expense getExpenseId() {
        return expense;
    }

    public void setExpenseId(Expense expenseId) {
        this.expense = expenseId;
    }


}

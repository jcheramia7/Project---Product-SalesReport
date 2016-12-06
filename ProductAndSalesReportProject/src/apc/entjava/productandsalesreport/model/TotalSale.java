package apc.entjava.productandsalesreport.model;


import javax.persistence.ManyToOne;

public class TotalSale {
    private Sale saleId;
    private Expense expenseId;

    public TotalSale() {
    }

    public TotalSale(Sale saleId, Expense expenseId) {
        this.saleId = saleId;
        this.expenseId = expenseId;
    }

    @ManyToOne
    public Sale getSaleId() {
        return saleId;
    }

    public void setSaleId(Sale saleId) {
        this.saleId = saleId;
    }

    @ManyToOne
    public Expense getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(Expense expenseId) {
        this.expenseId = expenseId;
    }
}

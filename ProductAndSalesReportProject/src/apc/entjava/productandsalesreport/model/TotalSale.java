package apc.entjava.productandsalesreport.model;



public class TotalSale {
    private Sale sale_id;
    private Expense expense_id;

    public TotalSale() {
    }

    public TotalSale(Sale sale_id, Expense expense_id) {
        this.sale_id = sale_id;
        this.expense_id = expense_id;
    }


    public Sale getSale_id() {
        return sale_id;
    }

    public void setSale_id(Sale sale_id) {
        this.sale_id = sale_id;
    }


    public Expense getExpense_id() {
        return expense_id;
    }

    public void setExpense_id(Expense expense_id) {
        this.expense_id = expense_id;
    }
}

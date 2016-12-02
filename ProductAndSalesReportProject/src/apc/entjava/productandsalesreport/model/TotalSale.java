package apc.entjava.productandsalesreport.model;

import javax.persistence.Entity;

/**
 * Created by Renzo on 21/11/2016.
 */

public class TotalSale {
    private int sale_id;
    private int expense_id;

    public TotalSale() {
    }

    public TotalSale(int sale_id, int expense_id) {
        this.sale_id = sale_id;
        this.expense_id = expense_id;
    }

    public int getSale_id() {
        return sale_id;
    }

    public void setSale_id(int sale_id) {
        this.sale_id = sale_id;
    }

    public int getExpense_id() {
        return expense_id;
    }

    public void setExpense_id(int expense_id) {
        this.expense_id = expense_id;
    }
}

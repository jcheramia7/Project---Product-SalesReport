package apc.entjava.productandsalesreport;

import apc.entjava.productandsalesreport.businesslogic.SalesAndProductReport;
import apc.entjava.productandsalesreport.dao.SalesAndProduct;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Created by johan on 27/11/2016.
 */
@ManagedBean
@SessionScoped
public class ExpenseBean {
    private String expenseDate;
    private int expenseName;
    private int expenseCost;

    public String getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(String expenseDate) {
        this.expenseDate = expenseDate;
    }

    public int getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(int expenseName) {
        this.expenseName = expenseName;
    }

    public int getExpenseCost() {
        return expenseCost;
    }

    public void setExpenseCost(int expenseCost) {
        this.expenseCost = expenseCost;
    }

    SalesAndProductReport salesandprod = new SalesAndProduct();
}

package apc.entjava.productandsalesreport;

import apc.entjava.productandsalesreport.businesslogic.SalesAndProductReport;
import apc.entjava.productandsalesreport.dao.SalesAndProduct;
import apc.entjava.productandsalesreport.model.Expense;
import jdk.nashorn.internal.ir.ExpressionStatement;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;

@ManagedBean
@SessionScoped
public class ExpenseBean {
    private SalesAndProductReport salesAndProductReport = new SalesAndProduct();

    private Expense expense;
    private String expenseDate;
    private int expenseName;
    private int expenseCost;

    private List<Expense> expenses;

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

    public List<Expense> getExpenses() {
        expenses = salesAndProductReport.getExpenses();
        return expenses;
    }

    public Expense getExpense() {
        return expense;
    }

    public String addExpense(){
        return null;
    }
}

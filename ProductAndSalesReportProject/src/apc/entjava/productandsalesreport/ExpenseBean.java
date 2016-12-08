package apc.entjava.productandsalesreport;

import apc.entjava.productandsalesreport.businesslogic.ExpenseService;
import apc.entjava.productandsalesreport.dao.ExpenseDao;
import apc.entjava.productandsalesreport.model.Expense;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;

@ManagedBean
@SessionScoped
public class ExpenseBean {
    private ExpenseService expenseService = new ExpenseDao();

    private Expense expense;
    private String expenseDate;
    private int expenseName;
    private int expenseCost;

    private List<Expense> expenses;

    public Expense getExpense() {
        if(this.expense == null){
            this.expense = new Expense();
        }
        return expense;
    }

    public void setExpense(Expense expense) {
        this.expense = expense;
    }

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
        expenses = expenseService.getExpenses();
        return expenses;
    }

    public String addExpense(){
        this.expenseService.addExpense(expense);
        return ("viewExpense?faces-redirect=true");
    }
}

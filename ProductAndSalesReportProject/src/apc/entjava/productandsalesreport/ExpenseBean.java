package apc.entjava.productandsalesreport;

import apc.entjava.productandsalesreport.businesslogic.ExpenseService;
import apc.entjava.productandsalesreport.dao.ExpenseDao;
import apc.entjava.productandsalesreport.model.Category;
import apc.entjava.productandsalesreport.model.Expense;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import java.io.Serializable;
import java.util.List;

@ManagedBean
@ViewScoped
public class ExpenseBean implements Serializable{
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

    public String delete(Expense expense){
        this.expenseService.remove(expense);
        return null;
    }


    public String editAction(Expense expense){
        expense.setEditable(true);
        return null;
    }
}

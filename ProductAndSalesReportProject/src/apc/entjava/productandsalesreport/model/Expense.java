package apc.entjava.productandsalesreport.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Expense {
    private int expenseId;
    private String expenseName;
    private BigDecimal expenseCost;
    private String expenseDate;

    public Expense() {
    }

    public Expense(int expenseId, String expenseName, BigDecimal expenseCost, String expenseDate) {
        this.expenseId = expenseId;
        this.expenseName = expenseName;
        this.expenseCost = expenseCost;
        this.expenseDate = expenseDate;
    }

    @Id
    public int getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(int expenseId) {
        this.expenseId = expenseId;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    public BigDecimal getExpenseCost() {
        return expenseCost;
    }

    public void setExpenseCost(BigDecimal expenseCost) {
        this.expenseCost = expenseCost;
    }

    public String getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(String expenseDate) {
        this.expenseDate = expenseDate;
    }
}

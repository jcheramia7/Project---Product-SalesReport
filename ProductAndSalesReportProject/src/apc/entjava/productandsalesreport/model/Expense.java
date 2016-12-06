package apc.entjava.productandsalesreport.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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
    @GeneratedValue
    public int getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(int expenseId) {
        this.expenseId = expenseId;
    }

    @Column(nullable = false)
    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    @Column(nullable = false)
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

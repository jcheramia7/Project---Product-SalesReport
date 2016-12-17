package apc.entjava.productandsalesreport.businesslogic;

import apc.entjava.productandsalesreport.model.Expense;

import java.util.List;

/**
 * Created by student on 12/8/2016.
 */
public interface ExpenseService {

    List<Expense> getExpenses();
    void addExpense(Expense newExpense);
	void remove(Expense expenseId);

}

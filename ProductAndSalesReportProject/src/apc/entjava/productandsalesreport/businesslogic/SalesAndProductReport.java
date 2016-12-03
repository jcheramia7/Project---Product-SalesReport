package apc.entjava.productandsalesreport.businesslogic;

import apc.entjava.productandsalesreport.model.Expense;
import apc.entjava.productandsalesreport.model.Product;
import apc.entjava.productandsalesreport.model.Sale;
import apc.entjava.productandsalesreport.model.User;

import java.util.List;

/**
 * Created by Renzo on 21/11/2016.
 */
public interface SalesAndProductReport {
    public List<User> findUser(int id);

    public Sale addSale(int id);
    public Sale findSale(int id);

    public Product addProduct(int id);
    public Product findProduct(int id);

    public Expense addExpense(int id);
    public Expense findExpense(int id);
}

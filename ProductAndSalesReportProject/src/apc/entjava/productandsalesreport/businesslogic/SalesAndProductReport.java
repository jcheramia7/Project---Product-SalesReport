package apc.entjava.productandsalesreport.businesslogic;

import apc.entjava.productandsalesreport.model.Expense;
import apc.entjava.productandsalesreport.model.Product;
import apc.entjava.productandsalesreport.model.Sale;
import apc.entjava.productandsalesreport.model.User;

import java.util.List;

public interface SalesAndProductReport {
    public List<User> listUser(int userId);

    void  register(User newUser);
    User login(String userUsername, String userPassword);

    /*public Sale addSale(int id);
    public List<Sale> listSale(int id);

    public Product addProduct(int id);
    public List<Product> listProduct(int id);

    public Expense addExpense(int id);
    public List<Expense> listExpense(int id);*/
}

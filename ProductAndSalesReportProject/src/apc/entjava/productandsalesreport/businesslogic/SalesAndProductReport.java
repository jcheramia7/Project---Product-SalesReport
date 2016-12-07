package apc.entjava.productandsalesreport.businesslogic;

import apc.entjava.productandsalesreport.model.*;

import java.util.List;

public interface SalesAndProductReport {
    /*public List<User> listUser(int userId);*/

    void  register(User newUser);
    User login(String userUsername, String userPassword);

    List<Category> getCategories();

    List<Sale> getSales();

    List<Product> getProducts();

    List<Expense> getExpenses();
}

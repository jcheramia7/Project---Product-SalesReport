package apc.entjava.productandsalesreport.businesslogic;

import apc.entjava.productandsalesreport.model.*;

import java.util.List;

public interface SalesAndProductReport {
    void  register(User newUser);
    User login(String userUsername, String userPassword);

    List<Category> getCategories();
    //void addCategory(Category newCategory);

    List<Sale> getSales();
    //void addSale(Sale newSale);

    List<Product> getProducts();
    //void addProduct(Product newProduct);

    List<Expense> getExpenses();
    //void addExpense(Expense newExpense);
}

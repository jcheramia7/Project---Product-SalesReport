package apc.entjava.productandsalesreport;

import apc.entjava.productandsalesreport.businesslogic.CategoryService;
import apc.entjava.productandsalesreport.businesslogic.ProductService;
import apc.entjava.productandsalesreport.dao.CategoryDao;
import apc.entjava.productandsalesreport.dao.ProductDao;
import apc.entjava.productandsalesreport.model.Category;
import apc.entjava.productandsalesreport.model.Product;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.mail.MessagingException;
import javax.mail.Part;
import javax.sql.rowset.serial.SerialArray;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@ManagedBean
@ViewScoped
public class ProductBean implements Serializable{
    private ProductService productService = new ProductDao();
    private CategoryService categoryService = new CategoryDao();

    private Product product;
    private String productName;
    private int productQuantity;
    private double productWeight;
    private double productCostPerItem;
    private double productPricePerItem;
    private String productExpirationDate;
    private int productAlertQuantity;
    private String productImageNeeded;
    private List<Product> products;
    private List<Category> categories;

    public Product getProduct() {
        if(this.product == null){
            this.product = new Product();
        }
        return product;
    }


    public void setProduct(Product product) {
        this.product = product;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(double productWeight) {
        this.productWeight = productWeight;
    }

    public double getProductCostPerItem() {
        return productCostPerItem;
    }

    public void setProductCostPerItem(double productCostPerItem) {
        this.productCostPerItem = productCostPerItem;
    }

    public double getProductPricePerItem() {
        return productPricePerItem;
    }

    public void setProductPricePerItem(double productPricePerItem) {
        this.productPricePerItem = productPricePerItem;
    }

    public String getProductExpirationDate() {
        return productExpirationDate;
    }

    public void setProductExpirationDate(String productExpirationDate) {
        this.productExpirationDate = productExpirationDate;
    }

    public int getProductAlertQuantity() {
        return productAlertQuantity;
    }

    public void setProductAlertQuantity(int productAlertQuantity) {
        this.productAlertQuantity = productAlertQuantity;
    }

    public String getProductImageNeeded() {
        return productImageNeeded;
    }

    public void setProductImageNeeded(String productImageNeeded) {
        this.productImageNeeded = productImageNeeded;
    }

    public List<Category> getCategories() {
        categories = categoryService.getCategories();
        return categories;
    }


    public List<Product> getProducts() {
        products = productService.getProducts();
        return products;
    }

    public String addProduct(){
        this.productService.addProduct(product);
        return ("viewProduct?faces-redirect=true");
    }
}

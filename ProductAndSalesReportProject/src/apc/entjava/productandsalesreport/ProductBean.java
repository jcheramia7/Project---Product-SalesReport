package apc.entjava.productandsalesreport;

import apc.entjava.productandsalesreport.businesslogic.SalesAndProductReport;
import apc.entjava.productandsalesreport.dao.SalesAndProduct;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ProductBean {
    private String productName;
    private String productCategory;
    private int productQuantity;
    private double productWeight;
    private double productCostPerItem;
    private double productPricePerItem;
    private String productExpirationDate;
    private int productAlertQuantity;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
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

    SalesAndProductReport salesandprod = new SalesAndProduct();
}

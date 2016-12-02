package apc.entjava.productandsalesreport.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

    private int productId;
    private String productName;
    private int productQuantity;
    private int productWeight;
    private int productCost;
    private int productPrice;
    private String productExpirationDate;
    private int productAlertQuantity;
    private String productImage;

    public Product() {
    }

    public Product(int productId, String productName, int productQuantity, int productWeight, int productCost, int productPrice, String productExpirationDate, int productAlertQuantity, String productImage) {
        this.productId = productId;
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productWeight = productWeight;
        this.productCost = productCost;
        this.productPrice = productPrice;
        this.productExpirationDate = productExpirationDate;
        this.productAlertQuantity = productAlertQuantity;
        this.productImage = productImage;
    }

    @Id
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
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

    public int getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(int productWeight) {
        this.productWeight = productWeight;
    }

    public int getProductCost() {
        return productCost;
    }

    public void setProductCost(int productCost) {
        this.productCost = productCost;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
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

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }
}

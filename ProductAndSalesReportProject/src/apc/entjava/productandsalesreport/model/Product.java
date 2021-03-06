package apc.entjava.productandsalesreport.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Product {

    private int productId;
    private String productName;
    private int productQuantity;
    private int productWeight;
    private BigDecimal productCost;
    private BigDecimal productPrice;
    private String productExpirationDate;
    private int productAlertQuantity;
    private String productImage;
    private User user;
    private Category category;
    private Boolean editable;

    public Product() {
    }

    public Product(int productId, String productName, int productQuantity, int productWeight, BigDecimal productCost, BigDecimal productPrice, String productExpirationDate, int productAlertQuantity, String productImage, User user, Category category) {
        this.productId = productId;
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productWeight = productWeight;
        this.productCost = productCost;
        this.productPrice = productPrice;
        this.productExpirationDate = productExpirationDate;
        this.productAlertQuantity = productAlertQuantity;
        this.productImage = productImage;
        this.user = user;
        this.category = category;
    }

    @Id
    @GeneratedValue
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Column(nullable = false)
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

    public BigDecimal getProductCost() {
        return productCost;
    }

    public void setProductCost(BigDecimal productCost) {
        this.productCost = productCost;
    }

    @Column(nullable = false)
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
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

    @ManyToOne
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Boolean isEditable() {
        return editable;
    }

    public void setEditable(Boolean editable) {
        this.editable = editable;
    }
}

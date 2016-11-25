package apc.entjava.productandsalesreport.model;

/**
 * Created by Renzo on 21/11/2016.
 */
public class Product {

    private int id;
    private String name;
    private int quantity;
    private int weight;
    private int cost;
    private int price;
    private String expirationDate;
    private int alertQuantity;
    private String image;

    public Product() {
    }

    public Product(int id, String name, int quantity, int weight, int cost, int price, String expirationDate, int alertQuantity, String image) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
        this.cost = cost;
        this.price = price;
        this.expirationDate = expirationDate;
        this.alertQuantity = alertQuantity;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getAlertQuantity() {
        return alertQuantity;
    }

    public void setAlertQuantity(int alertQuantity) {
        this.alertQuantity = alertQuantity;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

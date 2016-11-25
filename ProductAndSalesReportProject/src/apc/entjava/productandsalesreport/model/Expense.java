package apc.entjava.productandsalesreport.model;

/**
 * Created by Renzo on 21/11/2016.
 */
public class Expense {
    private int id;
    private String name;
    private int cost;
    private String date;

    public Expense() {
    }

    public Expense(int id, String name, int cost, String date) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.date = date;
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

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

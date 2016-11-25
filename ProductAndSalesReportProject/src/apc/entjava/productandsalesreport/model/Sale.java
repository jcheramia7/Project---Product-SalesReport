package apc.entjava.productandsalesreport.model;

/**
 * Created by Renzo on 21/11/2016.
 */
public class Sale {

    private int id;
    private String date;
    private int grossSales;
    private int bread;
    private int grocery;
    private int eLoad;
    private int smart;
    private int globe;
    private int sun;

    public Sale() {
    }

    public Sale(int id, String date, int grossSales, int bread, int grocery, int eLoad, int smart, int globe, int sun) {
        this.id = id;
        this.date = date;
        this.grossSales = grossSales;
        this.bread = bread;
        this.grocery = grocery;
        this.eLoad = eLoad;
        this.smart = smart;
        this.globe = globe;
        this.sun = sun;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(int grossSales) {
        this.grossSales = grossSales;
    }

    public int getBread() {
        return bread;
    }

    public void setBread(int bread) {
        this.bread = bread;
    }

    public int getGrocery() {
        return grocery;
    }

    public void setGrocery(int grocery) {
        this.grocery = grocery;
    }

    public int geteLoad() {
        return eLoad;
    }

    public void seteLoad(int eLoad) {
        this.eLoad = eLoad;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getGlobe() {
        return globe;
    }

    public void setGlobe(int globe) {
        this.globe = globe;
    }

    public int getSun() {
        return sun;
    }

    public void setSun(int sun) {
        this.sun = sun;
    }
}

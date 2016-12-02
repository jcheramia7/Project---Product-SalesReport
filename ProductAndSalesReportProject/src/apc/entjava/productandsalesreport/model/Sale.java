package apc.entjava.productandsalesreport.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sale {

    private int saleId;
    private String saleDate;
    private int saleGrossSales;
    private int saleBread;
    private int saleGrocery;
    private int saleEload;
    private int saleSmart;
    private int saleGlobe;
    private int saleSun;

    public Sale() {
    }

    public Sale(int saleId, String saleDate, int saleGrossSales, int saleBread, int saleGrocery, int saleEload, int saleSmart, int saleGlobe, int saleSun) {
        this.saleId = saleId;
        this.saleDate = saleDate;
        this.saleGrossSales = saleGrossSales;
        this.saleBread = saleBread;
        this.saleGrocery = saleGrocery;
        this.saleEload = saleEload;
        this.saleSmart = saleSmart;
        this.saleGlobe = saleGlobe;
        this.saleSun = saleSun;
    }

    @Id
    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    public int getSaleGrossSales() {
        return saleGrossSales;
    }

    public void setSaleGrossSales(int saleGrossSales) {
        this.saleGrossSales = saleGrossSales;
    }

    public int getSaleBread() {
        return saleBread;
    }

    public void setSaleBread(int saleBread) {
        this.saleBread = saleBread;
    }

    public int getSaleGrocery() {
        return saleGrocery;
    }

    public void setSaleGrocery(int saleGrocery) {
        this.saleGrocery = saleGrocery;
    }

    public int getSaleEload() {
        return saleEload;
    }

    public void setSaleEload(int saleEload) {
        this.saleEload = saleEload;
    }

    public int getSaleSmart() {
        return saleSmart;
    }

    public void setSaleSmart(int saleSmart) {
        this.saleSmart = saleSmart;
    }

    public int getSaleGlobe() {
        return saleGlobe;
    }

    public void setSaleGlobe(int saleGlobe) {
        this.saleGlobe = saleGlobe;
    }

    public int getSaleSun() {
        return saleSun;
    }

    public void setSaleSun(int saleSun) {
        this.saleSun = saleSun;
    }
}

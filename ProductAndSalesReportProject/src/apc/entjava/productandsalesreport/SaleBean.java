package apc.entjava.productandsalesreport;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Created by johan on 27/11/2016.
 */
@ManagedBean
@SessionScoped
public class SaleBean {
    private String saleDate;
    private int saleGrossSale;
    private int saleBread;
    private int saleGrocery;
    private int saleLoad;
    private int saleSmart;
    private int saleGlobe;
    private int saleSun;
    private int confirmGrossSale;
    private int confirmLoad;

    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    public int getSaleGrossSale() {
        return saleGrossSale;
    }

    public void setSaleGrossSale(int saleGrossSale) {
        this.saleGrossSale = saleGrossSale;
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

    public int getSaleLoad() {
        return saleLoad;
    }

    public void setSaleLoad(int saleLoad) {
        this.saleLoad = saleLoad;
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

    public int getConfirmGrossSale() {
        return confirmGrossSale;
    }

    public void setConfirmGrossSale(int confirmGrossSale) {
        this.confirmGrossSale = confirmGrossSale;
    }

    public int getConfirmLoad() {
        return confirmLoad;
    }

    public void setConfirmLoad(int confirmLoad) {
        this.confirmLoad = confirmLoad;
    }
}

package apc.entjava.productandsalesreport;

import apc.entjava.productandsalesreport.businesslogic.SalesAndProductReport;
import apc.entjava.productandsalesreport.dao.SalesAndProduct;
import apc.entjava.productandsalesreport.model.Sale;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;

@ManagedBean
@SessionScoped
public class SaleBean {

    private SalesAndProductReport salesAndProductReport = new SalesAndProduct();

    private Sale sale;
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

    private List<Sale> sales;

    public Sale getSale() {
        if(this.sale==null){
            this.sale = new Sale();
        }
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

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

    public List<Sale> getSales() {
        sales = salesAndProductReport.getSales();
        return sales;
    }

    public String addSales(){
        return null;
    }
}

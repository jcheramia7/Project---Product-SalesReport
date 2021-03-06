package apc.entjava.productandsalesreport.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Sale {

    private int saleId;
    private String saleDate;
    private BigDecimal saleGrossSales;
    private BigDecimal saleBread;
    private BigDecimal saleGrocery;
    private BigDecimal saleEload;
    private BigDecimal saleSmart;
    private BigDecimal saleGlobe;
    private BigDecimal saleSun;
    private User user;
    private Boolean editable;

    public Sale() {
    }

    public Sale(int saleId, String saleDate, BigDecimal saleGrossSales, BigDecimal saleBread, BigDecimal saleGrocery, BigDecimal saleEload, BigDecimal saleSmart, BigDecimal saleGlobe, BigDecimal saleSun, User user) {
        this.saleId = saleId;
        this.saleDate = saleDate;
        this.saleGrossSales = saleGrossSales;
        this.saleBread = saleBread;
        this.saleGrocery = saleGrocery;
        this.saleEload = saleEload;
        this.saleSmart = saleSmart;
        this.saleGlobe = saleGlobe;
        this.saleSun = saleSun;
        this.user = user;
    }

    @Id
    @GeneratedValue
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

    @Column(nullable = false)
    public BigDecimal getSaleGrossSales() {
        return saleGrossSales;
    }

    public void setSaleGrossSales(BigDecimal saleGrossSales) {
        this.saleGrossSales = saleGrossSales;
    }

    public BigDecimal getSaleBread() {
        return saleBread;
    }

    public void setSaleBread(BigDecimal saleBread) {
        this.saleBread = saleBread;
    }

    public BigDecimal getSaleGrocery() {
        return saleGrocery;
    }

    public void setSaleGrocery(BigDecimal saleGrocery) {
        this.saleGrocery = saleGrocery;
    }

    @Column(nullable = false)
    public BigDecimal getSaleEload() {
        return saleEload;
    }

    public void setSaleEload(BigDecimal saleEload) {
        this.saleEload = saleEload;
    }

    public BigDecimal getSaleSmart() {
        return saleSmart;
    }

    public void setSaleSmart(BigDecimal saleSmart) {
        this.saleSmart = saleSmart;
    }

    public BigDecimal getSaleGlobe() {
        return saleGlobe;
    }

    public void setSaleGlobe(BigDecimal saleGlobe) {
        this.saleGlobe = saleGlobe;
    }

    public BigDecimal getSaleSun() {
        return saleSun;
    }

    public void setSaleSun(BigDecimal saleSun) {
        this.saleSun = saleSun;
    }

    @ManyToOne
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Boolean isEditable() {
        return editable;
    }

    public void setEditable(Boolean editable) {
        this.editable = editable;
    }
}

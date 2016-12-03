package apc.entjava.productandsalesreport;

import apc.entjava.productandsalesreport.businesslogic.SalesAndProductReport;
import apc.entjava.productandsalesreport.dao.SalesAndProduct;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Created by johan on 27/11/2016.
 */
@ManagedBean
@SessionScoped
public class CategoryBean {

    private int categoryName;

    public int getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(int categoryName) {
        this.categoryName = categoryName;
    }

    SalesAndProductReport salesandproduct = new SalesAndProduct();
}

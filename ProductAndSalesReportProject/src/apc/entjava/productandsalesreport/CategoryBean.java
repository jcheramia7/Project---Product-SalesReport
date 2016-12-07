package apc.entjava.productandsalesreport;

import apc.entjava.productandsalesreport.businesslogic.SalesAndProductReport;
import apc.entjava.productandsalesreport.dao.SalesAndProduct;
import apc.entjava.productandsalesreport.model.Category;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;

@ManagedBean
@SessionScoped
public class CategoryBean {

    private SalesAndProductReport salesAndProductReport = new SalesAndProduct();

    private Category category;
    private String categoryName;

    private List<Category> categories;

    public String getCategoryName() {
        if(this.category==null){
            this.category = new Category();
        }
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Category> getCategories() {
        categories = salesAndProductReport.getCategories();
        return categories;
    }

    public Category getCategory() {
        return category;
    }

    public String addCategory(){
        return null;
    }
}

package apc.entjava.productandsalesreport;

import apc.entjava.productandsalesreport.businesslogic.CategoryService;
import apc.entjava.productandsalesreport.dao.CategoryDao;
import apc.entjava.productandsalesreport.model.Category;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

@ManagedBean
@ViewScoped
public class CategoryBean implements Serializable{
    private static final long serialVersionUID = 1L;

    private CategoryService categoryService = new CategoryDao();


    private Category category;
    private String categoryName;

    private List<Category> categories;
    private Category beforeEditItem = null;
    private Boolean editable;


    public Category getCategory() {
        if(this.category == null){
            this.category = new Category();

        }
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Category> getCategories() {
        categories = categoryService.getCategories();
        return categories;
    }

    public String addCategory(){
        this.categoryService.addCategory(category);
        return ("viewCategory?faces-redirect=true");
    }

    public void edit(Category category){
        beforeEditItem = category.clone();
    }

    public String delete(Category category){
        this.categoryService.remove(category);
        return null;
    }


    public String saveAction(){
       for (Category category : categories) {
            category.setEditable(false);
       }

       return null;
    }

    public String editAction(Category category){
        category.setEditable(true);
        return null;
    }
}

package apc.entjava.productandsalesreport;

import apc.entjava.productandsalesreport.businesslogic.CategoryService;
import apc.entjava.productandsalesreport.dao.CategoryDao;
import apc.entjava.productandsalesreport.model.Category;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;

@ManagedBean
@SessionScoped
public class CategoryBean {

    private CategoryService categoryService = new CategoryDao();

    private Category category;
    private String categoryName;

    private List<Category> categories;

    public Category getCategory() {
        if(this.category==null){
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
        return ("viewCategory");
    }
}

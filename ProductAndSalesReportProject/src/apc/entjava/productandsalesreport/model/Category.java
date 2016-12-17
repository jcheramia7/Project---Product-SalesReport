package apc.entjava.productandsalesreport.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Category{
    private int categoryId;
    private String categoryName;
    private Boolean editable;


    public Category() {
    }

    public Category(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    @Id
    @GeneratedValue
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Column(nullable = false)
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public Category clone(){
        return new Category(categoryId, categoryName);
    }

    public void restore(Category category){
        this.categoryId = category.categoryId;
        this.categoryName = category.categoryName;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }
}

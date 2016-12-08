package apc.entjava.productandsalesreport.businesslogic;

import apc.entjava.productandsalesreport.model.Category;

import java.util.List;

/**
 * Created by student on 12/8/2016.
 */
public interface CategoryService {

    List<Category> getCategories();

    void addCategory(Category newCategory);
}

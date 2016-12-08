package apc.entjava.productandsalesreport.businesslogic;

import apc.entjava.productandsalesreport.model.Product;

import java.util.List;

/**
 * Created by student on 12/8/2016.
 */
public interface ProductService {
    List<Product> getProducts();
    void addProduct(Product newProduct);

}

package apc.entjava.productandsalesreport.businesslogic;

import apc.entjava.productandsalesreport.model.Sale;

import java.util.List;

/**
 * Created by student on 12/8/2016.
 */
public interface SaleService {


    List<Sale> getSales();
    void addSale(Sale newSale);
}

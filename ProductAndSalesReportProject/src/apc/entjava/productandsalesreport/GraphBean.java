package apc.entjava.productandsalesreport;

import apc.entjava.productandsalesreport.businesslogic.TotalSaleService;
import apc.entjava.productandsalesreport.dao.TotalSaleDao;
import apc.entjava.productandsalesreport.model.TotalSale;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;

/**
 * Created by johan on 09/12/2016.
 */
@ManagedBean
@SessionScoped
public class GraphBean {

    private TotalSaleService totalSaleService = new TotalSaleDao();

    private TotalSale totalSale;

    private List<TotalSale> totalSales;

    public TotalSale getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(TotalSale totalSale) {
        this.totalSale = totalSale;
    }

    public List<TotalSale> getTotalSales() {
        totalSales = totalSaleService.getTotalSales();
        return totalSales;
    }
}

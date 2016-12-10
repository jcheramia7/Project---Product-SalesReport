package apc.entjava.productandsalesreport;

import apc.entjava.productandsalesreport.businesslogic.TotalSaleService;
import apc.entjava.productandsalesreport.dao.TotalSaleDao;
import apc.entjava.productandsalesreport.model.TotalSale;
import org.primefaces.model.chart.*;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.List;

/**
 * Created by johan on 09/12/2016.
 */
@ManagedBean
@ViewScoped
public class GraphBean implements Serializable{

    private TotalSaleService totalSaleService = new TotalSaleDao();

    private LineChartModel lineModel1;

   /* private TotalSale totalSale;

    private List<TotalSale> totalSales;*/

    @PostConstruct
    public void init(){
        createLineModels();
    }

    private void createLineModels() {
        lineModel1 = initLinearModel();
        lineModel1.setTitle("Linear Chart");
        lineModel1.setLegendPosition("e");
        Axis yAxis = lineModel1.getAxis(AxisType.Y);
        yAxis.setMin(0);
        yAxis.setMax(10);

    }

    private LineChartModel initLinearModel(){
        LineChartModel model = new LineChartModel();

        LineChartSeries series1 = new LineChartSeries();
        series1.setLabel("Series 1");

        series1.set(1, 2);
        series1.set(2, 1);
        series1.set(3, 3);
        series1.set(4, 6);
        series1.set(5, 8);

        LineChartSeries series2 = new LineChartSeries();
        series2.setLabel("Series 2");

        series2.set(1, 6);
        series2.set(2, 3);
        series2.set(3, 2);
        series2.set(4, 7);
        series2.set(5, 9);

        model.addSeries(series1);
        model.addSeries(series2);

        return  model;
    }


    /*public TotalSale getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(TotalSale totalSale) {
        this.totalSale = totalSale;
    }*/

    public LineChartModel getLineModel1() {
        return lineModel1;
    }


    /*public List<TotalSale> getTotalSales() {
        totalSales = totalSaleService.getTotalSales();
        return totalSales;
    }*/
}

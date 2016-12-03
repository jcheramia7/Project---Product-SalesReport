package apc.entjava.productandsalesreport;
import apc.entjava.productandsalesreport.businesslogic.SalesAndProductReport;
import apc.entjava.productandsalesreport.dao.SalesAndProduct;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by student on 9/26/2016.
 */
@ManagedBean
@SessionScoped
public class SignupBean {
    private String userUsername;
    private String userEmail;
    private String userPassword;

    public String getUserUsername() {
        return userUsername;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String signup(){
        return null;
    }

    SalesAndProductReport salesandprod = new SalesAndProduct();
}

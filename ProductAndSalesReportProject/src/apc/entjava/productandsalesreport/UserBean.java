package apc.entjava.productandsalesreport;
import apc.entjava.productandsalesreport.businesslogic.UserService;
import apc.entjava.productandsalesreport.dao.UserDao;
import apc.entjava.productandsalesreport.model.User;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean
@SessionScoped
public class UserBean implements Serializable{
    private UserService userService = new UserDao();

    private User user;
    private String username;
    private String password;
    private String email;

    public User getUser(){
        if(this.user==null){
            this.user = new User();
        }
        return user;
    }

    public void setUser(User user){
        this.user = user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        String pass = this.password;
        this.password = "";
        return pass;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String login(){
        this.user = this.userService.login(this.username, this.password);
        if(this.user != null){
            return "index?faces-redirect=true";
        }else {
            return "login?faces-redirect=true";
        }
    }

    public String register(){
        if(user.getUserPassword().equals(password)){
            this.userService.register(user);
            return ("login?faces-redirect=true");
        }else {
            return ("signup?faces-redirect=true");
        }
    }
}

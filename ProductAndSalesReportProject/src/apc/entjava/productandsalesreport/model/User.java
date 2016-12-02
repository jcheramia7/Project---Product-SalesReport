package apc.entjava.productandsalesreport.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class User {

    private int userId;
    private String userUername;
    private String userEmail;
    private String userPassword;
    private String userCreateTime;

    public User() {
    }

    public User(int userId, String userUername, String userEmail, String userPassword, String userCreateTime) {
        this.userId = userId;
        this.userUername = userUername;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userCreateTime = userCreateTime;
    }

    @Id
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserUername() {
        return userUername;
    }

    public void setUserUername(String userUername) {
        this.userUername = userUername;
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

    public String getUserCreateTime() {
        return userCreateTime;
    }

    public void setUserCreateTime(String userCreateTime) {
        this.userCreateTime = userCreateTime;
    }
}

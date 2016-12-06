package apc.entjava.productandsalesreport.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    private int userId;
    private String userUsername;
    private String userEmail;
    private String userPassword;
    private String userCreateTime;

    public User() {
    }

    public User(int userId, String userUsername, String userEmail, String userPassword, String userCreateTime) {
        this.userId = userId;
        this.userUsername = userUsername;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userCreateTime = userCreateTime;
    }

    @Id
    @GeneratedValue
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Column(nullable = false, length = 30)
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

    @Column(nullable = false)
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

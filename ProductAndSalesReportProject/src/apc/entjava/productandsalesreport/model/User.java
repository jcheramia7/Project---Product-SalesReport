package apc.entjava.productandsalesreport.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Renzo on 21/11/2016.
 */

@Entity
public class User {

    private int id;
    private String username;
    private String email;
    private String password;
    private String createTime;

    public User() {
    }

    public User(int id, String username, String email, String password, String createTime) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.createTime = createTime;
    }

    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}

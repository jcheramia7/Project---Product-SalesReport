package apc.entjava.productandsalesreport.businesslogic;

import apc.entjava.productandsalesreport.model.*;


public interface UserService {
    void register(User newUser);

    User login(String userUsername, String userPassword);


}

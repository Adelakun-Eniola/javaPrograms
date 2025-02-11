package classes;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Doctor extends User{
    private String role;

    public Doctor(String firstName, String lastName, String email, String phoneNumber, String address, String role, int userId) {
        super(firstName, lastName, email, phoneNumber, address, userId);
        this.role = role;
    }

    public void setRole(String role){
        this.role = role;
    }

    public String getRole(){
        return role;
    }

}

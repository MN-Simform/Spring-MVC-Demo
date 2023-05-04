package org.example.jee;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserValidation {
    public boolean isValid(String name, String password){
        if(name.equals("nimit") && password.equals("nimit123")){
            return true;
        }
        return false;
    }
}

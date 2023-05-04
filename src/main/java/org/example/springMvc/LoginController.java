package org.example.springMvc;

import org.example.jee.UserValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @Autowired
    UserValidation userValidation;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginPage(){
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String handleLoginReq(@RequestParam String name, @RequestParam String password , ModelMap model){

        if(userValidation.isValid(name,password)){
            model.put("name", name);
            return "welcome";
        }
        else {
            model.put("errMessage","Invalid Username Or Password");
            return "login";
        }
    }
}

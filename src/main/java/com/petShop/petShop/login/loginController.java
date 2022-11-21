package com.petShop.petShop.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class loginController {

    @GetMapping("/login")
    public String login(){
        System.out.println("hi");
        return "login";
    }
}

package com.example.reservation.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    private UserService joinService;

    @RequestMapping("/")
    public String home(Model model){
        return "home";
    }

    @RequestMapping("/register")
    public String signUp(Model model){
        return "join";
    }

    @RequestMapping("/complete")
    public String join(@RequestParam("email") String email, @RequestParam("name") String name,
                       @RequestParam("phone") String phone, @RequestParam("pwd") String pwd,
                       @RequestParam("pwd2") String pwd2, Model model) throws Exception {
        return "join";
    }

    @RequestMapping("/login")
    public String login(Model model) {

        return "login";
    }


}

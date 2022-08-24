package com.example.reservation.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JoinController {

    @RequestMapping("/")
    public String join(Model model){
        return "join";
    }
}

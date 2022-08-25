package com.example.reservation.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserService joinService;

    @RequestMapping("/")
    public String home(Model model){
        return "home";
    }

    @RequestMapping("/join")
    public String join() {
        return "join";
    }

    @PostMapping("/register")
    public String addUser(@RequestParam("id") String id, @RequestParam("name") String name,
                          @RequestParam("tel") String tel,@RequestParam("birth") String birth,
                          @RequestParam("pwd1") String pwd1) {
        joinService.addUser(id,name,tel,birth,pwd1);
        return "redirect:/";
    }

    @RequestMapping("/login")
    public String loginPage(Model model) {

        return "login";
    }

    @RequestMapping("/logincheck")
    public String login(@RequestParam Map<String, String> map, Model model, HttpSession session) {

        try{
            if(map.get("userid") == null || map.get("userpwd") == null ) {
                model.addAttribute("msg", "아이디 또는 비밀번호를 입력해주세요");
                return "error";
            }
            User user = joinService.login(map);
            if(user != null ) {
                session.setAttribute("user", user);
            }else {
                model.addAttribute("msg", "아이디 또는 비밀번호가 올바르지 않습니다.");
                return "error";
            }

        }catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("msg", "로그인 중 문제가 발생했습니다.");
            return "error";
        }

        return "/";
    }


}

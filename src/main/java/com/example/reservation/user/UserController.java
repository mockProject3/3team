package com.example.reservation.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserService joinService;

    @RequestMapping("/")
    public String home(@SessionAttribute(name = "user", required = false)User user, Model model){
        model.addAttribute("user", user);
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
    @ResponseBody
    public String login(@RequestParam Map<String, String> map, Model model, HttpSession session) {

        try{
            if(map.get("userId").isEmpty() || map.get("userPw").isEmpty() ) {
               // model.addAttribute("msg", "아이디 또는 비밀번호를 입력해주세요");
//                return "<script> alert('아이디 또는 비밀번호를 입력해주세요'); location.href='/login';</script>";
                return "<script> alert('아이디 또는 비밀번호를 입력해주세요'); location.href='/login'; </script>";
            }
            User user = joinService.login(map);
            if(user != null ) {
                session.setAttribute("user", user);
            }else {
              //  model.addAttribute("msg", "아이디 또는 비밀번호가 올바르지 않습니다.");
                return "<script> alert('아이디 또는 비밀번호가 올바르지 않습니다.'); location.href='/login'; </script>";
            }

        }catch (Exception e) {
            e.printStackTrace();
           // model.addAttribute("msg", "로그인 중 문제가 발생했습니다.");
            return "<script> alert('로그인 중 문제가 발생했습니다.'); location.href='/login'; </script>";
        }

        return "<script> location.href='/';</script>";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) throws Exception{
        session.invalidate();
        return "redirect:/";
    }


}

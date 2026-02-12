package me.shinsunyoung.springbootdeveloper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserViewController {
    @GetMapping("/login")
    // 일반 로그인
    public String login() {
        return "login";
    }
    // 소셜 로그인
//    public String login() {
//        return "oauthLogin";}

    @GetMapping("/signup")
    public String signup() {
        return "signup";
    }
}

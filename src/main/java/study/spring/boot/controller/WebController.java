package study.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping("/")
    public String home(){
        return "Index2";
    }

    @GetMapping("/login")
    public String login(){ return "login"; }

    @GetMapping("/img_3")
    public String img3(){ return "img_3"; }

    @GetMapping("/img_2")
    public String img2(){ return "img_2"; }

    @GetMapping("/img_1")
    public String img1(){ return "img_1"; }
}

package study.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import study.spring.boot.domain.User;
import study.spring.boot.service.LoginService;

@Controller
public class LoginController {
    private final LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/login")
    public String check(User user, Model model){
        if(user.getAge()==-1) {
            model.addAttribute("isSuccess", false);
            return "Index2";
        }

        if(loginService.signUp(user)) {
            model.addAttribute("welcomeMSG", " " + user.getName() + "!");
            model.addAttribute("isSuccess", true);
        } else{
            model.addAttribute("isSuccess", false);
        }
        return "Index2";
    }
}

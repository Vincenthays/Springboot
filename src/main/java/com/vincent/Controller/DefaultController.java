package com.vincent.Controller;

import com.vincent.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DefaultController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = {"/", "/login"})
    public String login() {
        return "commun/login";
    }

    @RequestMapping(value = "/test")
    public String test(Model model) {
        model.addAttribute("users", userService.findAll());
        return "test/test";
    }
}
package com.vincent.Controller;

import com.vincent.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SiteController {

    private final UserService userService;

    @Autowired
    public SiteController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }

}

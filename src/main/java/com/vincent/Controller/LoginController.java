package com.vincent.Controller;

import com.vincent.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/loginCheck", method = RequestMethod.POST)
    public boolean loginCheck(@RequestParam("login") String login, @RequestParam("password") String password) {
        return loginService.loginCheck(login, password);
    }
}

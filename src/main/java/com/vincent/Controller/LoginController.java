package com.vincent.Controller;

import com.vincent.Service.LDAPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class    LoginController {

    @Autowired
    private LDAPService ldapService;

    @RequestMapping(value = "/loginCheck", method = RequestMethod.POST)
    public boolean loginCheck(@RequestParam("login") String login,
                              @RequestParam("password") String password) {
        return ldapService.loginCheck(login, password);
    }
}

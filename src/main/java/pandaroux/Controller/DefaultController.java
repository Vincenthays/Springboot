package pandaroux.Controller;

import pandaroux.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


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
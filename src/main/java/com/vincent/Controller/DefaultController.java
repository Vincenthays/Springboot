package com.vincent.Controller;

import com.vincent.Repository.StudentRepository;
import com.vincent.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "index";
    }
}

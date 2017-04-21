package com.vincent.Controller;

import com.vincent.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @RequestMapping(value = "/classes")
    public String classes(Model model) {
        // model.addAttribute("users", userService.findAll());
        return "teacher/classes";
    }

    @RequestMapping(value = "/quiz")
    public String quiz(Model model) {
        // model.addAttribute("users", userService.findAll());
        return "teacher/quiz";
    }

    @RequestMapping(value = "/statistics")
    public String statistics(Model model) {
        // model.addAttribute("users", userService.findAll());
        return "teacher/statistics";
    }
}

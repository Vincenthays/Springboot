package com.vincent.Controller;

import com.vincent.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

    private final TeacherService teacherService;

    @Autowired
    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @RequestMapping(value = "/index")
    public String index() {
        return "redirect:/teacher/group";
    }

    @RequestMapping(value = "/group")
    public String group() {
        return "teacher/group";
    }



}

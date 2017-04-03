package com.vincent.Controller;

import com.vincent.Repository.StudentRepository;
import com.vincent.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.vincent.Entity.Student;

import java.util.List;


@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Student> getAll() {
        return studentService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable("id") int id) {
        return studentService.findById(id);
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.PUT)
    public void addStudent(@PathVariable("name") String name) {
        studentService.save(new Student(name));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteStudentById(@PathVariable("id") int id) {
        studentService.deleteById(id);
    }
}

package com.theironyard.java_Spring_HTML_Thymeleaf_Project.controllers;

import com.theironyard.java_Spring_HTML_Thymeleaf_Project.entities.Grade;
import com.theironyard.java_Spring_HTML_Thymeleaf_Project.entities.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

    @RequestMapping("/new_student")
    public String newStudent(Model model) {
        model.addAttribute("grades", Grade.values());
        return "new_student";
    }

    @RequestMapping(value = "/create_student", method = RequestMethod.POST)
    public String createStudent(@RequestParam(value = "firstName") String firstName,
                                @RequestParam(value = "lastName") String lastName,
                                @RequestParam(value = "grade") Grade grade,
                                Model model)
    {
        Student student = new Student();

        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setGrade(grade);

        model.addAttribute("student", student);
        return "create_student";
    }
}

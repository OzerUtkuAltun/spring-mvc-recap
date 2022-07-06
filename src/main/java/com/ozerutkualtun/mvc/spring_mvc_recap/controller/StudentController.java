package com.ozerutkualtun.mvc.spring_mvc_recap.controller;

import com.ozerutkualtun.mvc.spring_mvc_recap.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/students")
public class StudentController {

    @GetMapping("/show-form")
    public String showForm(Model model){

        model.addAttribute("student", new Student());
        return "student-form";
    }

    @PostMapping("/process-student-form")
    public String processStudentForm(@ModelAttribute("student") Student student){
        return "student-confirmation";
    }

}

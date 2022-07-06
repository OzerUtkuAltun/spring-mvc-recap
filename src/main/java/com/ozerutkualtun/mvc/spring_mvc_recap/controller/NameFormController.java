package com.ozerutkualtun.mvc.spring_mvc_recap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
public class NameFormController {


    @RequestMapping("/nameForm")
    public String showNameForm(){
        return "name-form";
    }

    @RequestMapping("/processNameForm")
    public String processNameForm() {
        return "name-form-result";
    }

    @RequestMapping("/processNameFormFromModel")
    public String processNameFormFromModel(HttpServletRequest httpServletRequest, Model model) {

        String name = httpServletRequest.getParameter("studentName");
        model.addAttribute("message", name.toUpperCase(Locale.ROOT));
        return "name-form-result";
    }

    @RequestMapping("/processNameFormFromModelUsingRequestParam")
    public String processNameFormFromModel(@RequestParam("studentName") String name, Model model) {

        model.addAttribute("message", name.toUpperCase(Locale.ROOT) + " (message read by request param)");
        return "name-form-result";
    }



}

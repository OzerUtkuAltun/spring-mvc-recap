package com.ozerutkualtun.mvc.spring_mvc_recap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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


}

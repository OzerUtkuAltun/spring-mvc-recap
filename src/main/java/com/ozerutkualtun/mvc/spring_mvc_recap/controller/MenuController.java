package com.ozerutkualtun.mvc.spring_mvc_recap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuController {

    @RequestMapping("/")
    public String showMenu() {
        return "main-menu";
    }


}

package com.ozerutkualtun.mvc.spring_mvc_recap.controller;

import com.ozerutkualtun.mvc.spring_mvc_recap.model.Customer;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/customers")
public class CustomerController {


    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        // stringTrimmerEditor sol ve sağ taraftaki whitespaceleri temizler.
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(Boolean.TRUE); // Boolean.TRUE -> empty as null kabul etsin diye
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor); // bütün stringlere trimmer uygulansın diye.
    }

    @GetMapping("/show-form")
    public String showForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer-form";
    }


    @PostMapping("/process-customer-form")
    public String processCustomerForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {
        // Not: binding result model attribute'den hemen sonra gelmeli.

        if(bindingResult.hasErrors()) {
            return "customer-form";
        } else {
            return "customer-confirmation";
        }
    }

}

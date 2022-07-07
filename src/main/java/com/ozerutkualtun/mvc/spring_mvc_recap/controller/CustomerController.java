package com.ozerutkualtun.mvc.spring_mvc_recap.controller;

import com.ozerutkualtun.mvc.spring_mvc_recap.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/customers")
public class CustomerController {

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

package com.validation.springbootvalidation.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.validation.springbootvalidation.entites.LoginData;

@Controller
public class MyController {
    @GetMapping("/form")
    public String openForm(Model m) {
        m.addAttribute("loginData", new LoginData());
        return "form";
    }

    // handler for process form
    @PostMapping("/process")
    public String processForm(@Valid @ModelAttribute("loginData") LoginData loginData, BindingResult result) {
        // System.out.println(result.hasErrors());
        // if (!result.hasErrors()) {
        // System.out.println(result);
        // System.out.println(result.hasErrors());
        // return "form";
        // }

        System.out.println(loginData);
        return "success";
    }
}

package com.testautomationcoach.conference.controller;

import com.testautomationcoach.conference.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class RegistrationController {

    @GetMapping("/registration")
    public String getRegistration(@ModelAttribute("registration") Registration registration) {
        return "registration";
    }

    @PostMapping("registration")
    public String postRegistration(@ModelAttribute("registration") Registration registration) {
        System.out.println(registration.getName());
        return "registration";
    }
}

package com.tutorial.thymelaf.thymeleaftutorial.controller;

import com.tutorial.thymelaf.thymeleaftutorial.model.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;

@Controller
public class FormController {
    // This is the controller class that will handle the requests and responses.
    // The @Controller annotation is used to define the class as a controller.
    // The @Controller annotation is a specialization of the @Component annotation.

    //handler method to handle user registration form
    //http:localhost:8080/userRegistrationForm
    @GetMapping("/userRegistrationForm")
    public String userRegistrationForm(Model model){
        // Empty UserForm model object to store form data
        UserForm userForm = new UserForm();
        model.addAttribute("userForm", userForm);

        List<String> listProfession = Arrays.asList("Developer", "Designer", "IT Manager", "Tester");
        model.addAttribute("listProfession", listProfession);

        return "userRegistrationForm";
    }

    // handler method to handle user registration form submission request
    @GetMapping("/userRegistrationForm/save")
    public String userRegistrationFormSubmit(Model model, @ModelAttribute("userForm") UserForm userForm){
        model.addAttribute("userForm", userForm);
        return "registrationSuccess";
    }


}

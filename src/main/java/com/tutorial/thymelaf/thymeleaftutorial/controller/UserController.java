package com.tutorial.thymelaf.thymeleaftutorial.controller;

import com.tutorial.thymelaf.thymeleaftutorial.model.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

        // This is the controller class that will handle the requests and responses.
        // The @Controller annotation is used to define the class as a controller.
        // The @Controller annotation is a specialization of the @Component annotation.

        // handleRequest() method is used to handle the requests and responses.
        @GetMapping("/variableExpression")
        public String variableExpression(Model model) {
            // The @GetMapping annotation is used to map the HTTP GET requests.
            // The @GetMapping annotation is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod.GET).
            UserDto user = new UserDto("John Doe", "john.doe@example.com", "Admin", "Male");
            model.addAttribute("user", user);

            return "variableExpression";

        }
}

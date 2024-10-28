package com.tutorial.thymelaf.thymeleaftutorial.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class helloWorldController {

    // This is the controller class that will handle the requests and responses.
    // The @Controller annotation is used to define the class as a controller.
    // The @Controller annotation is a specialization of the @Component annotation.

    // handleRequest() method is used to handle the requests and responses.
    @GetMapping("/helloWorld")
    public String helloWorld(Model model) {
        // The @GetMapping annotation is used to map the HTTP GET requests.
        // The @GetMapping annotation is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod.GET).

        // The helloWorld() method is used to handle the requests and responses.
        // The Model object is used to add the attributes to the view.
        // The addAttribute() method is used to add the attributes to the view.
        model.addAttribute("message", "Hello World!");

        // The return statement is used to return the view name.
        String message = "Hello World!";
        return  "helloWorld";

    }
}

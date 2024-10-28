package com.tutorial.thymelaf.thymeleaftutorial.controller;

import com.tutorial.thymelaf.thymeleaftutorial.model.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

        // This is the controller class that will handle the requests and responses.
        // The @Controller annotation is used to define the class as a controller.
        // The @Controller annotation is a specialization of the @Component annotation.

        // handleRequest() method is used to handle the requests and responses.
        // http:localhost:8080/variableExpression
        @GetMapping("/variableExpression")
        public String variableExpression(Model model) {
            // The @GetMapping annotation is used to map the HTTP GET requests.
            // The @GetMapping annotation is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod.GET).
            UserDto user = new UserDto("John Doe", "john.doe@example.com", "Admin", "Male");
            model.addAttribute("user", user);

            // return the view
            return "variableExpression";

        }

        // handler method to handle selection expression
        // http:localhost:8080/selectionExpression
        @GetMapping("/selectionExpression")
        public String selectionExpression(Model model) {
            // The @GetMapping annotation is used to map the HTTP GET requests.
            // The @GetMapping annotation is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod.GET).
            UserDto user = new UserDto("John Doe", "john.doe@example.com", "Admin", "Male");
            model.addAttribute("user", user);

            // return the view
            return "selectionExpression";
        }

        // handler method to handle message expressions request
        // http:localhost:8080/messageExpression
        @GetMapping("messageExpression")
        public String messageExpression(){
            return "messageExpression";
        }

        // handler method to handle link expressions request
        // http:localhost:8080/linkExpression
        @GetMapping("linkExpression")
        public String linkExpression(Model model){
            model.addAttribute("id", "1");
            return "linkExpression";
        }

        // handler method to handle fragment expressions request
        // http:localhost:8080/fragmentExpression
        @GetMapping("fragmentExpression")
        public String fragmentExpression(){
            return "fragmentExpression";
        }

        // handler method to handle iteration expressions request
        // http:localhost:8080/users
        @GetMapping("users")
        public String users(Model model) {
            UserDto user1 = new UserDto("John Doe", "john.doe@example.com", "Admin", "Male");
            UserDto user2 = new UserDto("Jane Doe", "Jane.doe@example.com", "User", "Female");
            UserDto user3 = new UserDto("Tom Smith", "tom.smith@example.com", "User", "Male");

            /*
             * Création d'une liste immutable : La liste créée par List.of ne peut pas être modifiée après sa création
             * (pas d'ajout, de suppression ou de modification d'éléments). Toute tentative de modification lève une
             * UnsupportedOperationException.
             * */
            List<UserDto> users = List.of(user1, user2, user3);

            model.addAttribute("users", users);
            return "users";
        }
}

package com.tutorial.thymelaf.thymeleaftutorial.model;

import lombok.Data;
//import lombok.Getter;
//import lombok.Setter;

@Data
//@Getter
//@Setter
public class UserForm {
    private String name;
    private String email;
    private String password;
    private String gender;
    private String address;
    private String married;
    private String profession;
}

package org.alfonso.collections.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
public class UserController {

    @GetMapping("/prueba")
    public String prueba(){
        return "probando";
    }

}
package org.alfonso.collections.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping(value = "/prueba", produces = MediaType.APPLICATION_JSON_VALUE)
    public String prueba(){
        return "probando";
    }

}

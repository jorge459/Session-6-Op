package com.jachi.ejercicios.session6.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/saludo")
    public String saludo(){
        return "Hola Open Bootcamp";
    }
}

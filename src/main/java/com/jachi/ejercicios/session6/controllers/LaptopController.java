package com.jachi.ejercicios.session6.controllers;

import com.jachi.ejercicios.session6.models.Laptop;
import com.jachi.ejercicios.session6.repositories.LaptopRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LaptopController {
    private LaptopRepository repository;
    public LaptopController(LaptopRepository repository){
        this.repository = repository;
    }
    @GetMapping("/laptops")
    public List<Laptop> findAll(){
        return repository.findAll();
    }
    @PostMapping("/laptops")
    public Laptop save(@RequestBody Laptop laptop){
        return repository.save(laptop);
    }
}

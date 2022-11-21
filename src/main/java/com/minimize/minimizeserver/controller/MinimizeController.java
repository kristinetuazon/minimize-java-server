package com.minimize.minimizeserver.controller;
import com.minimize.minimizeserver.MinimizeRepo;
import com.minimize.minimizeserver.model.ListCollection;
import com.minimize.minimizeserver.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class MinimizeController {

final MinimizeRepo repository;
Service service;

    public MinimizeController(MinimizeRepo repository) {
        this.repository = repository;
    }


    @GetMapping("/all")
public List<ListCollection> getAll() {
    return service.getAll();
}


@RequestMapping("/goodbye")
public String goodBye () {
    return "ByeBye";
}

@RequestMapping("/hello")
public String helloWorld () {
    return "Hello world from SpringBoot";
    }
}

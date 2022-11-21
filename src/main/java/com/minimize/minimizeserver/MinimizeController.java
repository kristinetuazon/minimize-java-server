package com.minimize.minimizeserver;
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

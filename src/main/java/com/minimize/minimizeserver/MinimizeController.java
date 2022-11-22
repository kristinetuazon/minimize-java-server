package com.minimize.minimizeserver;
import lombok.val;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class MinimizeController {

    private final MinimizeRepo repository;
    private final MinimizeService service;

    public MinimizeController(MinimizeRepo repository, MinimizeService service){
        this.repository = repository;
        this.service = service;
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

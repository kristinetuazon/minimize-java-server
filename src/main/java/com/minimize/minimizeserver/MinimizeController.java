package com.minimize.minimizeserver;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin
public class MinimizeController {

    private final MinimizeRepo repository;
    private final MinimizeService service;

    public MinimizeController(MinimizeRepo repository, MinimizeService service){
        this.repository = repository;
        this.service = service;
    }


    //Get
    @GetMapping("/all")
    public List<ListCollection> getAll() {
    return service.getAll();
        }

    @GetMapping("get/{uId}")
    public List<ListCollection> getByUid (@PathVariable String uId)
    { return service.getByUid(uId); }

    @GetMapping("list/{nameOfList}")
    public List<ListCollection> getByListName (@PathVariable String nameOfList)
    { return service.getByListName(nameOfList);}

}

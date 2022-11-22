package com.minimize.minimizeserver;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public List<Collection> getAll() {
    return service.getAll();
        }
    @GetMapping("get/{uId}")
    public List<Collection> getByUid (@PathVariable String uId)
    { return service.getByUid(uId); }
    @GetMapping("get/list/{nameOfList}")
    public List<Collection> getByListName (@PathVariable String nameOfList)
    { return service.getByListName(nameOfList);}
    @GetMapping("get/id/{id}")
    public Optional<Collection> getById (@PathVariable String id)
    { return service.getById(id);}

    //POST
    @PostMapping("/add/newCollection")
    public Collection postNewCollection (@RequestBody Collection collection) {
       return service.save(collection);
    }

    //Delete
    @DeleteMapping("/delete/list/{nameOfList}")
    @Transactional
    public void deleteByListName (@PathVariable String nameOfList) {
        service.deleteByNameOfList(nameOfList);
    }

    @DeleteMapping("/delete/id/{id}")
    @Transactional
    public void deleteById (@PathVariable String id) {
        service.deleteById(id);
    }

}

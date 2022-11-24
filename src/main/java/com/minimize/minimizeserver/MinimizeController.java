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

    MinimizeController(MinimizeRepo repository, MinimizeService service){
        this.repository = repository;
        this.service = service;
    }

    //Get
    @GetMapping("/")
    String helloWorld() {
        return service.helloWorld();
    }
    @GetMapping("/all")
    List<Collection> getAll() {
    return service.getAll();
        }
    @GetMapping("get/{uId}")
    List<Collection> getByUid (@PathVariable String uId)
    { return service.getByUid(uId); }
    @GetMapping("get/list/{nameOfList}")
    List<Collection> getByListName (@PathVariable String nameOfList)
    { return service.getByListName(nameOfList);}
    @GetMapping("get/id/{id}")
    Optional<Collection> getById (@PathVariable String id)
    { return service.getById(id);}
    @GetMapping("get/email/{userEmail}")
    List<Collection> getByEmail (@PathVariable String userEmail) {
        return service.getByEmail(userEmail);
    }

    //Post
    @PostMapping("/add/newCollection")
    Collection postNewCollection (@RequestBody Collection collection) {
       return service.save(collection);
    }

//    @PutMapping("/update/deletedList/{id}")
//    Optional<Collection> updateDeletedList(@RequestBody Object newDeletedList, @PathVariable String id) {
//        Optional<Collection> dbInformation = service.getById(id).setDeletedList(newDeletedList);
//                return dbInformation;
//    }

    //Delete
    @DeleteMapping("/delete/list/{nameOfList}")
    @Transactional
    void deleteByListName (@PathVariable String nameOfList) {
        service.deleteByNameOfList(nameOfList);
    }
    @DeleteMapping("/delete/id/{id}")
    @Transactional
    void deleteById (@PathVariable String id) {
        service.deleteById(id);
    }

}

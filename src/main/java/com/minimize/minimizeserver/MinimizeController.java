package com.minimize.minimizeserver;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    ResponseEntity<String> postNewCollection (@RequestBody Collection collection) {
        try {
            service.save(collection);
            return new ResponseEntity<>("Added new Collection", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }

    @PutMapping("/update/{id}")
    ResponseEntity<String> updateDeletedList(@RequestBody Collection changeCollection, @PathVariable("id") String id) {
        try {
            service.updateById(id, changeCollection);
            return new ResponseEntity<>("Update the Collection with the id: " + id, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }

    @PutMapping("/update/list/{id}")
    ResponseEntity<String> updateLists(@RequestBody Collection newLists, @PathVariable("id") String id) {
        try {
            service.updateListsByStringId(id, newLists);
            return new ResponseEntity<>("Updated the collection lists with this information: "+newLists, HttpStatus.UNPROCESSABLE_ENTITY);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(),HttpStatus.UNPROCESSABLE_ENTITY);
        }

    }

    //Delete
    @DeleteMapping("/delete/list/{nameOfList}")
    @Transactional
    ResponseEntity<String> deleteByListName (@PathVariable String nameOfList) {
        try {
            service.deleteByNameOfList(nameOfList);;
            return new ResponseEntity<>("Deleted the Collection", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }
    @DeleteMapping("/delete/id/{id}")
    @Transactional
    ResponseEntity<String> deleteById (@PathVariable String id) {
        try {
            service.deleteById(id);
            return new ResponseEntity<>("Deleted the Collection", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }

}

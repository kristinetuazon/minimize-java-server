package com.minimize.minimizeserver;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MinimizeService {
    MinimizeRepo repository;

    public MinimizeService(MinimizeRepo repository) {
        this.repository = repository;
    }

    //general get
    public List<Collection> getAll() {
        return repository.findAll();
    }

    //queries for specificity
    public List<Collection> getByUid(String uId) {
        return repository.findByuId(uId);
    }
    public List<Collection> getByListName(String nameOfList) {
        return repository.findBynameOfList(nameOfList);
    }
    public Optional<Collection> getById(String id) {
        return repository.findById(id);
    }
    public List<Collection> getByEmail(String userEmail) {
        return repository.getByuserEmail(userEmail);
    }

    //Post
    public Collection save(Collection collection) {
        return repository.save(collection);
    }
    //Delete
    public void deleteByNameOfList (String nameOfList) {
        repository.deleteByNameOfList(nameOfList);
    }
    public void deleteById(String id) {
        repository.deleteById(id);
    }

    //Put
    public void updateById(String id, Collection collection) {
        Optional<Collection>  collectionWithId = repository.findById(id);
        if (collectionWithId.isPresent()) {
            Collection collectionToUpdate = collectionWithId.get();

            collectionToUpdate.setNameOfList(collection.getNameOfList());
            collectionToUpdate.setInitialList(collection.getInitialList());
            collectionToUpdate.setListDescription(collection.getListDescription());
        }
    }

    public String helloWorld() {
        String message = "Hello World";
        return message;
    }
}



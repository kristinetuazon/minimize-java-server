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
}



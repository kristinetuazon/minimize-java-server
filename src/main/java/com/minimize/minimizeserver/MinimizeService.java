package com.minimize.minimizeserver;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MinimizeService {
    MinimizeRepo repository;

    public MinimizeService(MinimizeRepo repository) {
        this.repository = repository;
    }

    //general get

    public List<ListCollection> getAll() {
        return repository.findAll();
    }

    //queries for specificity
    public List<ListCollection> getByUid(String uId) {
        return repository.findByuId(uId);
    }

    public List<ListCollection> getByListName(String nameOfList) {
        return repository.findBynameOfList(nameOfList);
    }

    //Post
    public List saveOrUpdateList (List ListCollection) {
        return repository.save(ListCollection);
    }

    //Delete
    public void deleteByNameOfList (String nameOfList) {
        repository.delete(nameOfList);
    }

}



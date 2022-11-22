package com.minimize.minimizeserver;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MinimizeRepo extends MongoRepository <ListCollection, String> {

    //find
    List<ListCollection> findByuId(String uId);

    List<ListCollection> findBynameOfList(String nameOfList);

    //change and update
    List save (List ListCollection);

    //delete
//    void delete (String id);


    void delete(String nameOfList);
}

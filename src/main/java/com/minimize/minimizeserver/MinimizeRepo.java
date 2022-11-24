package com.minimize.minimizeserver;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MinimizeRepo extends MongoRepository <Collection, String> {

    //find
   List<Collection> findByuId(String uId);

   List<Collection> findBynameOfList(String nameOfList);

   Optional<Collection> findById(String nameOfList);

   List<Collection> getByuserEmail(String userEmail);

    //change and update
    Collection save(Collection collection);

    //delete

    void deleteByNameOfList(String nameOfList);

    void deleteById(String id);


}

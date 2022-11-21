package com.minimize.minimizeserver;

import com.minimize.minimizeserver.model.ListCollection;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MinimizeRepo extends MongoRepository <ListCollection, String> {

    @Query("{nameOfList:'?0'}")
    ListCollection findListByName(String nameOfList);

    @Query("{uId: '?0'}")
    ListCollection findByUid(String uId);

    public long count();

}

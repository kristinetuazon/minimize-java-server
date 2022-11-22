package com.minimize.minimizeserver;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.query.Query;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Document(collection="lists")
@Data
@NoArgsConstructor
public class ListCollection {

    private String nameOfList;
    private String userEmail;
    private String uId;
    private String listDescription;
    private List<Object> initialList;
    private List<Object> deletedList;
    private List<Object> finalList;
    private List<Object> maybeList;
    private List<Object> sessions;

    private Date dateCreated;
    private Date dateUpdated;



    public ListCollection(String nameOfList, String userEmail, String uId, String listDescription, List<Object> initialList, List<Object> deletedList, List<Object> finalList, List<Object> maybeList, List<Object> sessions, Timestamp dateCreated, Timestamp dateUpdated) {

        this.nameOfList = nameOfList;
        this.userEmail = userEmail;
        this.uId = uId;
        this.listDescription = listDescription;
        this.initialList = initialList;
        this.deletedList = deletedList;
        this.finalList = finalList;
        this.maybeList = maybeList;
        this.sessions = sessions;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }

}

package com.minimize.minimizeserver.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

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


    public ListCollection(String nameOfList, String userEmail, String uId, String listDescription, List<Object> initialList, List<Object> deletedList, List<Object> finalList, List<Object> maybeList, List<Object> sessions) {

        this.nameOfList = nameOfList;
        this.userEmail = userEmail;
        this.uId = uId;
        this.listDescription = listDescription;
        this.initialList = initialList;
        this.deletedList = deletedList;
        this.finalList = finalList;
        this.maybeList = maybeList;
        this.sessions = sessions;
    }

}

package com.minimize.minimizeserver;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Document(collection="lists")
@Data
@NoArgsConstructor
public class Collection {

    @Id
    private String id;
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

    public Collection(String id, String nameOfList, String userEmail, String uId, String listDescription, List<Object> initialList, List<Object> deletedList, List<Object> finalList, List<Object> maybeList, List<Object> sessions, Timestamp dateCreated, Timestamp dateUpdated) {

        this.id = id;
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
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getUId() {
        return uId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String setUserEmail(String userEmail) {
        return this.userEmail = userEmail;
    }

    public String getNameOfList() {
        return nameOfList;
    }

    public void setNameOfList(String nameOfList) {
        this.nameOfList = nameOfList;
    }

    public String getListDescription() {
        return listDescription;
    }

    public void setListDescription(String listDescription) {
        this.listDescription = listDescription;
    }

    public void setDeletedList (List deletedList) {
        this.deletedList = deletedList;
    }

    public void setFinalList (List finalList) {
        this.finalList = finalList;
    }

    public void setMaybeList (List maybeList) {
        this.maybeList = maybeList;
    }



}

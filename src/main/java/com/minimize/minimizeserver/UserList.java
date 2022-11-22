package com.minimize.minimizeserver;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
public class UserList {
    private String id;
    private String itemName;


    public UserList (String id, String itemName) {
        this.id = id;
        this.itemName=itemName;
    }
}

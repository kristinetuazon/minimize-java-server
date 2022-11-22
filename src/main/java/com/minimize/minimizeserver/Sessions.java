package com.minimize.minimizeserver;

import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

public class Sessions {

    @Id
    private String sessionsId;

    private List<String> collectionId;
    private String uId;
    private Date logInTime;
    private int activeTime;
    private Date logOutTime;

    public Sessions (String sessionsId, String uId, Date logInTime, int activeTime, Date logOutTime) {
        this.sessionsId = sessionsId;
        this.uId = uId;
        this.logInTime = logInTime;
        this.activeTime = activeTime;
        this.logOutTime = logOutTime;
    }
}

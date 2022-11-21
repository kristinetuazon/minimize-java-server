package com.minimize.minimizeserver.service;

import com.minimize.minimizeserver.MinimizeRepo;
import com.minimize.minimizeserver.model.ListCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@org.springframework.stereotype.Service
public class Service {
    @Autowired
    MinimizeRepo repo;

    public List<ListCollection> getAll() {
        return repo.findAll();
    }
}

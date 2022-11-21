package com.minimize.minimizeserver;

import com.minimize.minimizeserver.MinimizeRepo;
import com.minimize.minimizeserver.ListCollection;

import java.util.List;
@org.springframework.stereotype.Service
public class Service {
    MinimizeRepo repo;

    public Service(MinimizeRepo repo) {
        this.repo = repo;
    }

    public List<ListCollection> getAll() {
        return repo.findAll();
    }
}

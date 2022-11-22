package com.minimize.minimizeserver;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class MinimizeService {
    MinimizeRepo repository;

    public MinimizeService(MinimizeRepo repository) {
        this.repository = repository;
    }

    public List<ListCollection> getAll() {
        return repository.findAll();
    }
}

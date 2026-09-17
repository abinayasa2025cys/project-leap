package com.example.project1.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.project1.Repository.project1repository;
import com.example.project1.Model.project1model;

@Service
public class project1service {
    @Autowired
    project1repository repository;

    public project1model create(project1model table) {
        return repository.save(table);
    }

    public List<project1model> getAll() {
        return repository.findAll();
    }
}

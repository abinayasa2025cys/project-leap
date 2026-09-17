package com.example.project1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.project1.Model.project1model;
import com.example.project1.Service.project1service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class project1controller {

    @Autowired
    project1service service;

    @PostMapping("/create")
    public project1model create(@RequestBody project1model table) {
        return service.create(table);
    }

    @Getmapping("/getAll")
    public List<project1model> getAll() {
        return service.getAll();
    }

}

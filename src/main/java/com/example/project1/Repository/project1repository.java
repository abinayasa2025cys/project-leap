package com.example.project1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project1.Model.project1model;

@Repository
public interface project1repository extends JpaRepository<project1model, Integer> {

}

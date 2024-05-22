package com.example.AWS.controller.repository;

import com.example.AWS.controller.SQLDBemployeeBean;

import com.example.AWS.controller.libraryBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface employeeRepository extends JpaRepository<SQLDBemployeeBean, Integer > {
    void Password();
}



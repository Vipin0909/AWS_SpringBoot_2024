package com.example.AWS.controller.repository;

import com.example.AWS.controller.MongoDBEmployeeBean;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface employeeRepositoryMongo extends MongoRepository<MongoDBEmployeeBean, Integer > {

}

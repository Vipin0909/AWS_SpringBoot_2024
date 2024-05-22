package com.example.AWS.controller;

import com.example.AWS.controller.repository.employeeRepositoryMongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class employeeControllerMongo {
    @Autowired
    employeeRepositoryMongo empRepo1;

//    @Autowired
//    MongoDBEmployeeBean emp;
//    employeeBeanMongo employee1 = new employeeBeanMongo();

//    @GetMapping("services/getemployeeMongo/{empid}")
//    public employeeBeanMongo getempMongo(@PathVariable(value="empid") Integer empid)
//    {
//
//        try {
//            employeeBeanMongo emp1 = empRepo1.findById(empid).get();
//            return emp1;
//        } catch (Exception e)
//        {
//                throw new ResponseStatusException(HttpStatus.NOT_FOUND);
//        }
//    }

    @PostMapping("services/addemployeesMongo")
    public void addEmployees(@RequestBody MongoDBEmployeeBean emp){
        empRepo1.save(emp);

    }

}

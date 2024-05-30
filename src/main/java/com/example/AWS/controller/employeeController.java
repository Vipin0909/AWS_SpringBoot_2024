package com.example.AWS.controller;

import com.example.AWS.controller.repository.employeeRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
//Test CI 2

import static org.springframework.http.HttpStatus.CREATED;

@RestController
public class employeeController  {
    @Autowired
    employeeRepository empRepo;
//    @Autowired
//    SQLDBemployeeBean test;

    SQLDBemployeeBean test = new SQLDBemployeeBean();

    //@GetMapping("services/getemployee/{empid}")
    @GetMapping("/{empid}")
    public ResponseEntity<SQLDBemployeeBean> getemp(@PathVariable(value = "empid") int empid) {
        try {

            test = empRepo.findById(empid).get();

        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        //return test;
        //addResponse.employeeResponse empres = new addResponse.employeeResponse();

        return new ResponseEntity<SQLDBemployeeBean>(test, HttpStatus.FOUND);
    }


    @PostMapping("services/addemployeesSQL")
    public ResponseEntity<addResponse> addEmployees(@RequestBody SQLDBemployeeBean employeesSQL) throws JsonProcessingException {
        empRepo.save(employeesSQL);
//        ObjectMapper mapper = new ObjectMapper(jsonresponse);
//        String actualResponse = mapper.writeValueAsString(jsonresponse);
//        JsonPath actualjson = new JsonPath(actualResponse);
//        System.out.println("this is actual response--" +actualjson.toString());
        addResponse response = new addResponse();
        response.setMsg("Employee saved to database");
        response.setId(employeesSQL.getEmpid());

        return new ResponseEntity<addResponse>(response, CREATED);
//        return actualjson ;
    }



//@Test
//public void validation() throws JsonProcessingException {
//    SQLDBemployeeBean empdata = addEmployees();
//    ObjectMapper mapper = new ObjectMapper();
//    String jsonstring = mapper.writeValueAsString(empdata);
//    JsonPath actualjs1 =new JsonPath(jsonstring);
//    System.out.println(actualjs1.get("empid").toString());
//
//}

}

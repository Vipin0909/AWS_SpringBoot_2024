package com.example.AWS.controller;

import com.example.AWS.controller.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.JsonPath;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


@RestController
public class libraryController {
    @Autowired
    libraryBean lb;
    @Autowired
    LibraryRepository repository;
// get book from DB - GET request
    @GetMapping("Services/getBooks/{id}")
    public libraryBean getLibraryDataById(@PathVariable(value="id") String id) {

        try{
            libraryBean library = repository.findById(id).get();
            return library;
        }catch (Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }


 // Save book into DB - POST request
    @PostMapping("Services/addbook")
    public ResponseEntity saveLibraryData(@RequestBody libraryBean lib ){

        lib.setId(lib.getAuther()+lib.getBookname());
        repository.save(lib);
        addResponse response = new addResponse();
        response.setId(Integer.parseInt(lib.getAuther()+lib.getBookname()));
        response.setMsg("Book created Successfully..");

        //return response;

        return new ResponseEntity<addResponse>(response,HttpStatus.CREATED);


    }
}

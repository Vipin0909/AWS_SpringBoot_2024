package com.example.AWS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class greetingController {

    @Autowired
    greetingBean bean;
    @GetMapping("/greeting")
    public greetingBean greeting(@RequestParam(value="name") String name){

        //greetingBean bean = new greetingBean();
        bean.setName(name);
        return bean;

    }
}

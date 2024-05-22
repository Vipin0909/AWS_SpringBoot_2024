package com.example.AWS.controller;

import org.springframework.stereotype.Component;

@Component
public class greetingBean {
String name;
String id;
public String getName(){
    return name;
}
public void setName(String name){
    this.name=name;
}

public String getid(){
    return id;
}
public void setid(String id){
    this.id=id;
}

}

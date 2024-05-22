package com.example.AWS.controller;

import com.fasterxml.jackson.core.JsonFactory;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name = "mycompany")

public class SQLDBemployeeBean {

    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "city")
    String city;
    @Column(name = "dept")
    String dept;
    @Id
    @Column(name = "empid")
    private int empid;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname1) {
        this.firstname = firstname1;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int id) throws Exception {
        try{
            if(empid<=6){
                System.out.println("valid employee");
            }else {
                System.out.println("in valid employee");
            }
        }catch(Exception e){
            throw new Exception("invalid emp id");
        }

        this.empid = empid;
    }


}

package com.example.AWS.controller;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class addResponse {
    String msg;
    int id;
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    static class employeeResponse{
        private String firstname;
        private String lastname;
        String city;
        String dept;
        private int empid;


        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
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

        public void setEmpid(int empid) {
            this.empid = empid;
        }


    }

}

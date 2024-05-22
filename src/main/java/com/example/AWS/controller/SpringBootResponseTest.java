package com.example.AWS.controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

public class SpringBootResponseTest {

    @Autowired
    libraryController con;

    @Test
    public void testAddBookTest() {
        ResponseEntity response = con.saveLibraryData(buildLibrary());
        response.getStatusCode();
    }

    public libraryBean buildLibrary() {
        libraryBean lib = new libraryBean();
        lib.setId("vip123");
        lib.setAuther("vip");
        lib.setAisle("AAAA");
        lib.setBookname("my JAVA");
        lib.setIsbn("ISBN");
        return lib;
    }

    public SQLDBemployeeBean buildEmployeeData() throws Exception {
        SQLDBemployeeBean empbean = new SQLDBemployeeBean();
        empbean.setEmpid(123456);
        empbean.getEmpid();
        return empbean;
    }

}

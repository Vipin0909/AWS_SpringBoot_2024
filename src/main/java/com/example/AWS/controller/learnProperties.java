package com.example.AWS.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class learnProperties {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/main/resources/application.properties");
        Properties prop = new Properties();
        prop.load(fis);

        System.out.println(prop.get("server.port"));
    }
}

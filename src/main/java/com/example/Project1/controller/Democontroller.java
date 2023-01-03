package com.example.Project1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

//use annotation after creating a class-- @RestController
@RestController
public class Democontroller {

   //use annotation for creating end point @RequestMapping
    @RequestMapping("/hello")// end point name

    public void hello(){

        System.out.println("Hello , Spring Boot");
        //after that now create a url by using port
        // http://localhost:port/endpoint

        //So the URL of this point is  http://localhost:8080/hello

    }
    // String Method
    @RequestMapping("/data")
    public String data (){

        String datamember ="Welcome to the Family member ";

        return datamember;
        // make a end point and use annotation above the method

        // for printing now use the URL with end point
        //URL IS http://localhost:port/endpoint
        //  http://localhost:8080/data
    }
    // Array LiSt
    @RequestMapping("family")
    public ArrayList<String> family (){

        ArrayList<String> family = new ArrayList<>();
        family.add("Sandeep");
        family.add("Siddharth");
        family.add("Sanjay");

        return family;
        // make a end point and use annotation above the method

        // for printing now use the URL with end point
        //URL IS http://localhost:port/endpoint
        //  http://localhost:8080/family
    }

}

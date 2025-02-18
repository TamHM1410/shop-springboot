package com.example.shopdevsrping.controller;

import com.example.shopdevsrping.utils.Constants;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(Constants.PREFIX_ENDPOINT + "v1")
public class hello {
    @Value("${my.name}") ///config env
    private String name;
    @GetMapping("/hello")
    public String hello(){
        return  "Hello World";
    }
    @GetMapping("/infor")
    public String infor(){
        return  "my name is "+name;
    }


}

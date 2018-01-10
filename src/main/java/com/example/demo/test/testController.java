package com.example.demo.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class testController {

    @Autowired
    private testDaoService service;

    @GetMapping("/test")
    public List<test> getAll(){
        return service.findAll();

    }
}

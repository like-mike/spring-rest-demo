package com.example.demo.test;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class testDaoService {

    private static List<test> testList = new ArrayList<>();

    static{
        testList.add(new test(1,"Mike",new Date()));
        testList.add(new test(2,"Celena",new Date()));
    }

    public List<test> findAll(){
        return testList;

    }
}

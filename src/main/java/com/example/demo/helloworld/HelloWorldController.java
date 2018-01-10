package com.example.demo.helloworld;

import com.example.demo.helloworld.HelloWorldBean;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    //GET
    //URL - Hello-world
    @GetMapping("/hello-world")
    public String helloWorld(){

        return "Hello World";
    }

    @GetMapping("hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        HelloWorldBean test = new HelloWorldBean("test");
        return test;
    }

    @GetMapping("hello-world/path-variable/{name}")
    public HelloWorldBean testF(@PathVariable String name){
        HelloWorldBean test = new HelloWorldBean(String.format("Hello molly, %s",name));
        return test;
    }

    @GetMapping("/hello-world-internationalized")
    public String helloWorldInternationalized(){
        return "Good Morning";
    }


}

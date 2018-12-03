package com.drnmnl.restfulws1;


import org.springframework.web.bind.annotation.*;

@RestController
    public class HelloWorldController {
        //method: GET
        //URI: /hello-world
    	
        @RequestMapping(method=RequestMethod.GET, path="/hello-world")      // @GetMapping(path="/hello-world")
        public String helloWorld() {
            return "Hello World";
        }


        @GetMapping(path="/hello-world-bean")      // @GetMapping(path="/hello-world")
        public HelloWorldBean helloWorldBean() {
            return new HelloWorldBean("Hello World! -bean");
        } // Object is auto-converted by Spring Boot to JSON

    }


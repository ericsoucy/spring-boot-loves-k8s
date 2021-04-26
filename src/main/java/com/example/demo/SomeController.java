package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {

  @PostMapping("/")
  void doSomeStuff(){
    System.out.println("done some stuff");
  }

  @GetMapping("/")
  String getSomeStuff(){
    System.out.println("get some stuff");
    return "some stuff";
  }
}

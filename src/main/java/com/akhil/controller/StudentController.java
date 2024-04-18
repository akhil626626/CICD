package com.akhil.controller;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class StudentController {
     @GetMapping("/info/{name}")
    public String StudentInfo(@PathVariable(value = "name") String name){

         return " welcome to my page" + name+ "have a great day";

    }
}

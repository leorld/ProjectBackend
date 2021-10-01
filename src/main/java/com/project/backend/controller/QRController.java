package com.project.backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class QRController {

    @GetMapping("/place/{name}")
    public void getPlace(@PathVariable("name") String name) {
        System.out.println("매장 :"+name);

    }
}

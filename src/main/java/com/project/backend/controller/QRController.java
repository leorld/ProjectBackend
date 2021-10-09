package com.project.backend.controller;


import com.project.backend.service.PlaceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class QRController {

    private final PlaceService menuService;

    @GetMapping("/test")
    public String controllerTest() {
        return "working well";
    }

    @GetMapping("/place/{name}")
    public void getPlace(@PathVariable("name") Long id) {
        menuService.findMenu(id).forEach(objects -> System.out.println(Arrays.toString(objects)));
    }
}

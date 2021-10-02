package com.project.backend.service;

import com.project.backend.domain.Place;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class PlaceServiceTest {

    @Autowired
    private PlaceService placeService;


    @Test
    public void 조회테스트() {
        Long id = 1L;
        placeService.findMenu(id).forEach(obj -> {
            System.out.println(Arrays.toString(obj));
        });

    }

}
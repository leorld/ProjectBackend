package com.project.backend.controller;

import com.project.backend.service.PlaceService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class QRControllerTest {

    @Autowired
    private QRController qrController;


    @Test
    public void 조회테스트() {
        Long id = 1L;
        System.out.println("컨트롤러 테스트");
        qrController.getPlace(id);
    }

}
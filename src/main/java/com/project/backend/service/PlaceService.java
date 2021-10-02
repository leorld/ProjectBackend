package com.project.backend.service;


import com.project.backend.repository.PlaceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
@Service
public class PlaceService {

    private final PlaceRepository placeRepository;

    //매장 id -> 메뉴 객체 반환 (메뉴 이름, 가격)
    public List<Object[]> findMenu(Long id) {
        return placeRepository.findByPlaceNameAndMenu(id);

    }

}

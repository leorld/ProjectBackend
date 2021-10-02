package com.project.backend.repository;

import com.project.backend.domain.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaceRepository extends JpaRepository<Place, Long> {
   // 매장 번호 == 메뉴 테이블의 place_id와 같은 (메뉴, 가격) 찾아서 반환
   @Query("select m.menuName, m.price from Menu m join Place p on p = m.place where p.id = ?1")
   List<Object[]> findByPlaceNameAndMenu(Long id);
}

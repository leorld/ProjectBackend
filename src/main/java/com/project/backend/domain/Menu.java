package com.project.backend.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String menuName;
    @Column(nullable = false)
    private Integer price;

    @ManyToOne
    private Place place;

    private Menu(String menuName, Integer price ,Place place){
        this.menuName = menuName;
        this.price = price;
        this.place = place;
    }

}

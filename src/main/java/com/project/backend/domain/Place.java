package com.project.backend.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String address;

    @JsonIgnore
    @OneToMany(mappedBy = "place", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Menu> menuse;

    @Builder
    private Place(String name, String address) {
        this.name = name;
        this.address = address;
    }
}

package com.ramon.rest_api_rpg.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "planet")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Planet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "planetName", nullable = false)
    private String planetName;

    @JsonIgnore
    @OneToMany(mappedBy = "planet")
    private List<Asteroid> asteroids;

}

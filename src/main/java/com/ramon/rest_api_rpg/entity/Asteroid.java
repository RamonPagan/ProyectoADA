package com.ramon.rest_api_rpg.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "asteroid")
public class Asteroid {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "asteroid_name", nullable = false)
    private String asteroidName;

    @Column(name = "estimated_diameter_min")
    private Double estimatedDiameterMin;

    @Column(name = "estimated_diameter_max")
    private Double estimatedDiameterMax;

    @Column(name = "relative_velocity")
    private Double relativeVelocity;

    @Column(name = "orbital_period")
    private Double orbitalPeriod;

    @ManyToOne
    @JoinColumn(name = "planet_id")
    private Planet planet;
}

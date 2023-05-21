package com.ramon.rest_api_rpg.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "dangerousness")
public class Dangerousness {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "impact_probability")
    private Double impactProbability;

    @Column(name = "kinetic_energy")
    private Double  kineticEnergy;

    @Column(name = "impact_date")
    private Date impactDate;

    @OneToOne
    @JoinColumn(name = "asteroid_id")
    private Asteroid asteroid;

}

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
@Table(name = "discovery")
public class Discovery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "discovery_date")
    private Date discoveryDate;

    @Column(name = "discovery_method")
    private String discoveryMethod;

    @OneToOne
    @JoinColumn(name = "asteroid_id")
    private Asteroid asteroid;

    @ManyToOne
    @JoinColumn(name = "observatory_id")
    private Observatory observatory;
}

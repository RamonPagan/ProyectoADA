package com.ramon.rest_api_rpg.repository;

import com.ramon.rest_api_rpg.entity.Observatory;
import com.ramon.rest_api_rpg.entity.Planet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlanetRepository extends JpaRepository<Planet, Long> {
    List<Planet> findAll();

    List<Planet>findByPlanetName(String planetName);


    void deleteById(Long id);

    void deleteByPlanetName(String planetName);
}

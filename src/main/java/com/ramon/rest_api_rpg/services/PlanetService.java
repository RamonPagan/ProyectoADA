package com.ramon.rest_api_rpg.services;

import com.ramon.rest_api_rpg.entity.Planet;
import com.ramon.rest_api_rpg.repository.PlanetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanetService {
    private final PlanetRepository planetRepository;

    public PlanetService(PlanetRepository planetRepository) {
        this.planetRepository = planetRepository;
    }

    public List<Planet> findAll(){
        return planetRepository.findAll();
    }
}

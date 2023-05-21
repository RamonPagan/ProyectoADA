package com.ramon.rest_api_rpg.controller;

import com.ramon.rest_api_rpg.services.PlanetService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PlanetController {
    private final PlanetService planetService;

    public PlanetController(PlanetService planetService){
        this.planetService = planetService;
    }
}

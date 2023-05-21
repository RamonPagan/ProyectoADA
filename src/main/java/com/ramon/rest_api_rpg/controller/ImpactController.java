package com.ramon.rest_api_rpg.controller;

import com.ramon.rest_api_rpg.services.ImpactService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ImpactController {

    private final ImpactService impactService;

    public ImpactController(ImpactService impactService){
        this.impactService = impactService;
    }
}

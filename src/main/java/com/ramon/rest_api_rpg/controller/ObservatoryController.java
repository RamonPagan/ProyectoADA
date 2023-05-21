package com.ramon.rest_api_rpg.controller;

import com.ramon.rest_api_rpg.services.ObservatoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ObservatoryController {

    private final ObservatoryService observatoryService;

    public ObservatoryController(ObservatoryService observatoryService){
        this.observatoryService = observatoryService;
    }
}

package com.ramon.rest_api_rpg.controller;

import com.ramon.rest_api_rpg.entity.Asteroid;
import com.ramon.rest_api_rpg.repository.DangerousnessRepository;
import com.ramon.rest_api_rpg.services.DangerousnessService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DangerousnessController {

    private final DangerousnessService dangerousnessService;

    public DangerousnessController(DangerousnessService dangerousnessService){
        this.dangerousnessService = dangerousnessService;
    }

}

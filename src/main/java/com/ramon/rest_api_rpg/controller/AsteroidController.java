package com.ramon.rest_api_rpg.controller;

import com.ramon.rest_api_rpg.entity.Asteroid;
import com.ramon.rest_api_rpg.entity.Planet;
import com.ramon.rest_api_rpg.services.AsteroidService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AsteroidController {
    private final AsteroidService asteroidService;


    public AsteroidController(AsteroidService asteroidService) {
        this.asteroidService = asteroidService;
    }

    @GetMapping("/asteroids")
    public List<Asteroid> getAsteroids(){
        return asteroidService.findAll();
    }

    @GetMapping
    public List<Asteroid> getAsteroidsPagedAndSortedByDescName(@RequestParam Integer pageNo, @RequestParam Integer pageSize){
        return asteroidService.findAll(pageNo, pageSize);
    }

    @GetMapping("/asteroid-id/{id}")
    public Asteroid getAsteroid(@PathVariable("id") Long asteroidId){
        return asteroidService.findById(asteroidId);
    }

    @GetMapping("/asteroidbiggest/{id}")
    public Asteroid getBiggestAsteroid(@PathVariable("id") Long asteroidId){
        return asteroidService.findById(asteroidId);
    }

    @GetMapping("/asteroid-name/{name}")
    public Asteroid getAsteroidByName(@PathVariable(name = "name") String asteroidName){
        return asteroidService.findAsteroidByName(asteroidName);
    }

    @PostMapping("/asteroid-new/")
    public Asteroid newAsteroid(@RequestBody Asteroid asteroid){
        return asteroidService.save(asteroid);
    }

    @PutMapping("/asteroid-update/")
    public Asteroid updateAsteroid(@RequestBody Asteroid asteroid){
        return asteroidService.update(asteroid);
    }

    @DeleteMapping("/asteroid-delete/{id}")
    public boolean deleteAsteroid(@PathVariable("id") Long id){
        return asteroidService.remove(id);
    }

    @DeleteMapping("/a/{id}")
    public boolean deleteByName(@PathVariable("id") Long id){
        return asteroidService.removeByName(id);
    }



}

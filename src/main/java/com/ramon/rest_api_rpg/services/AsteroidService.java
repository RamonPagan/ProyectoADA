package com.ramon.rest_api_rpg.services;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.ramon.rest_api_rpg.entity.Asteroid;
import com.ramon.rest_api_rpg.entity.Planet;
import com.ramon.rest_api_rpg.repository.AsteroidRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.springframework.data.domain.Sort.by;
import static org.springframework.data.domain.Sort.sort;

@Service
public class AsteroidService {
    private final AsteroidRepository asteroidRepository;

    public AsteroidService(AsteroidRepository asteroidRepository) {
        this.asteroidRepository = asteroidRepository ;
    }

    public List<Asteroid> findAll(){
        return asteroidRepository.findAll();
    }

    public List<Asteroid> findAll(Integer pageNo, Integer pageSize){
        Pageable pageable = PageRequest.of(pageNo, pageSize, Sort.by(Sort.Direction.DESC, "no"));
        Page<Asteroid> page = asteroidRepository.findAll(pageable);
        if(page.hasContent()){
            return  page.getContent();
        }else{
            return null;
        }
    }

    public Asteroid findFirstByOrderEstimatedDiameterMin(){
        List<Asteroid> asteroids = asteroidRepository.findAllAndOrderByEstimatedDiameterMin();
       return asteroids.get(1);
    }

    public Asteroid findById(Long id){
        return asteroidRepository.findById(id).get();
    }

    public Asteroid save(Asteroid asteroid){
        return asteroidRepository.save(asteroid);
    }

    public Asteroid update(Asteroid asteroid){
        return asteroidRepository.save(asteroid);
    }

    public Asteroid change(Asteroid asteroid){
        return asteroidRepository.save(asteroid);
    }

    public boolean remove(Long id){
        if(asteroidRepository.existsById(id)){
            asteroidRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public boolean removeByName(Long id){
        Asteroid t = asteroidRepository.findById(id).get();
        asteroidRepository.deleteByAsteroidName(t.getAsteroidName());
        return true;
    }



    public Asteroid findAsteroidByName(String asteroidName){
        return asteroidRepository.findByAsteroidName(asteroidName);
    }

}

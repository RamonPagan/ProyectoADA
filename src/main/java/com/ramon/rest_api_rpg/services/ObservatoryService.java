package com.ramon.rest_api_rpg.services;

import com.ramon.rest_api_rpg.entity.Asteroid;
import com.ramon.rest_api_rpg.entity.Discovery;
import com.ramon.rest_api_rpg.entity.Observatory;
import com.ramon.rest_api_rpg.repository.ObservatoryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ObservatoryService {
    private final ObservatoryRepository observatoryRepository;

    public ObservatoryService(ObservatoryRepository observatoryRepository) {
        this.observatoryRepository = observatoryRepository;
    }

    public List<Observatory> findAll(){
        return observatoryRepository.findAll();
    }

    public List<Observatory> findAll(Integer pageNo, Integer pageSize){
        Pageable pageable = PageRequest.of(pageNo, pageSize);
        Page<Observatory> page = observatoryRepository.findAll(pageable);
        if(page.hasContent()){
            return  page.getContent();
        }else{
            return null;
        }
    }
    public List<Asteroid> findAsteroidsById(Long id){
        Observatory observatory = observatoryRepository.findById(id).get();
        List<Asteroid> asteroids = new ArrayList<>();
        for (Discovery d:observatory.getDiscoveries()) {
            asteroids.add(d.getAsteroid());
        }
        return asteroids;
    }


}

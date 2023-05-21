package com.ramon.rest_api_rpg.repository;

import com.ramon.rest_api_rpg.entity.Asteroid;
import com.ramon.rest_api_rpg.entity.Observatory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ObservatoryRepository extends JpaRepository<Observatory, Long>{
    List<Observatory> findAll();

    List<Observatory>findByObservatoryName(String observatoryName);


    void deleteById(Long id);

    void deleteByObservatoryName(String observatoryName);
}

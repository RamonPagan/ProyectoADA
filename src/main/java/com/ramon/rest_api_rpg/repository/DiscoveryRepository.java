package com.ramon.rest_api_rpg.repository;

import com.ramon.rest_api_rpg.entity.Asteroid;
import com.ramon.rest_api_rpg.entity.Discovery;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.stream.Stream;

public interface DiscoveryRepository extends JpaRepository<Discovery, Long> {
    List<Discovery> findAll();

    List<Discovery>findByAsteroidId(String asteroidId);

    List<Discovery>findByAsteroidAsteroidName(String asteroidName);

    List<Discovery>findByObservatoryId(String observatoryId);

    List<Discovery>findByObservatoryObservatoryName(String observatoryName);




    void deleteById(Long id);

    void deleteByAsteroidId(String asteroidId);

    void deleteByAsteroidAsteroidName(String asteroidName);

    void deleteByObservatoryId(String observatoryId);

    void deleteByObservatoryObservatoryName(String observatoryName);
}

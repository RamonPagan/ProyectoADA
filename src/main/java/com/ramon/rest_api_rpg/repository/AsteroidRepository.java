package com.ramon.rest_api_rpg.repository;

import com.ramon.rest_api_rpg.entity.Asteroid;
import com.ramon.rest_api_rpg.entity.Planet;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

public interface AsteroidRepository extends JpaRepository<Asteroid, Long>{

    List<Asteroid> findAll();

    Asteroid findByAsteroidName(String asteroidName);

    void deleteById(Long id);

    void deleteByAsteroidName(String asteroidName);


    List<Asteroid> findAllAndOrderByEstimatedDiameterMin();
}

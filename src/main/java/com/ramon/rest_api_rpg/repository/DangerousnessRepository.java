package com.ramon.rest_api_rpg.repository;

import com.ramon.rest_api_rpg.entity.Asteroid;
import com.ramon.rest_api_rpg.entity.Dangerousness;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.stream.Stream;

public interface DangerousnessRepository extends JpaRepository<Dangerousness, Long > {
    List<Dangerousness> findAll();

    List<Dangerousness>findByAsteroidId(String asteroidId);





    void deleteById(Long id);

    void deleteByAsteroidId(String asteroidId);
}

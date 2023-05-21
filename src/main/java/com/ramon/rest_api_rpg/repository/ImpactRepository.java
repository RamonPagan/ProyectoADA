package com.ramon.rest_api_rpg.repository;

import com.ramon.rest_api_rpg.entity.Discovery;
import com.ramon.rest_api_rpg.entity.Impact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImpactRepository extends JpaRepository<Impact, Long> {
    List<Impact> findAll();

    //List<Impact>findByAsteroidId(String asteroidId);

    //List<Impact>findByAsteroidName(String asteroidName);

    List<Impact>findByDangerousnessId(String dangerousnessId);





    void deleteById(Long id);

    //void deleteByAsteroidId(String asteroidId);

    //void deleteByAsteroidName(String asteroidName);

    void deleteByDangerousnessId(String dangerousnessId);

}

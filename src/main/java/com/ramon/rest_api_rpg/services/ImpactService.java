package com.ramon.rest_api_rpg.services;

import com.ramon.rest_api_rpg.entity.Impact;
import com.ramon.rest_api_rpg.repository.ImpactRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpactService {
    private final ImpactRepository impactRepository;

    public ImpactService(ImpactRepository impactRepository) {
        this.impactRepository = impactRepository;
    }

    public List<Impact> findAll(){
        return impactRepository.findAll();
    }
}

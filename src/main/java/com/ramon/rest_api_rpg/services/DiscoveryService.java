package com.ramon.rest_api_rpg.services;

import com.ramon.rest_api_rpg.entity.Discovery;
import com.ramon.rest_api_rpg.repository.DiscoveryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscoveryService {
    private final DiscoveryRepository discoveryRepository;

    public DiscoveryService(DiscoveryRepository discoveryRepository) {
        this.discoveryRepository = discoveryRepository;
    }

    public List<Discovery> findAll(){
        return discoveryRepository.findAll();
    }
}

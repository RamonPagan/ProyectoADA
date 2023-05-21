package com.ramon.rest_api_rpg.services;

import com.ramon.rest_api_rpg.entity.Dangerousness;
import com.ramon.rest_api_rpg.repository.DangerousnessRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DangerousnessService {
    private final DangerousnessRepository dangerousnessRepository;

    public DangerousnessService(DangerousnessRepository dangerousnessRepository) {
        this.dangerousnessRepository = dangerousnessRepository;
    }

    public List<Dangerousness> findAll(){
        return dangerousnessRepository.findAll();
    }
}

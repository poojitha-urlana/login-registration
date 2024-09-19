package com.farming.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farming.Model.Farm;
import com.farming.Repository.FarmRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FarmService {

    @Autowired
    private FarmRepository farmRepository;

    public Farm addFarm(Farm farm) {
        return farmRepository.save(farm);
    }

    public Farm updateFarm(Long id, Farm farm) {
        if (farmRepository.existsById(id)) {
            farm.setId(id);
            return farmRepository.save(farm);
        }
        return null;
    }

    public Optional<Farm> getFarmById(Long id) {
        return farmRepository.findById(id);
    }

    public void deleteFarm(Long id) {
        farmRepository.deleteById(id);
    }

    public List<Farm> getAllFarms() {
        return farmRepository.findAll();
    }
}

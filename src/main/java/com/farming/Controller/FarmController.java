package com.farming.Controller;

import com.farming.Model.Farm;
import com.farming.Service.FarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/farms")
public class FarmController {

    @Autowired
    private FarmService farmService;

    // Admin functionalities
    @Secured("ROLE_ADMIN")
    @PostMapping
    public ResponseEntity<Farm> addFarm(@RequestBody Farm farm) {
        Farm createdFarm = farmService.addFarm(farm);
        return ResponseEntity.ok(createdFarm);
    }

    
    @Secured("ROLE_ADMIN")
    @PutMapping("/{id}")
    public ResponseEntity<Farm> updateFarm(@PathVariable Long id, @RequestBody Farm farm) {
        Farm updatedFarm = farmService.updateFarm(id, farm);
        if (updatedFarm != null) {
            return ResponseEntity.ok(updatedFarm);
        }
        return ResponseEntity.notFound().build();
    }

    @Secured("ROLE_ADMIN")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFarm(@PathVariable Long id) {
        farmService.deleteFarm(id);
        return ResponseEntity.noContent().build();
    }

    // User and Admin functionalities
    @GetMapping("/{id}")
    public ResponseEntity<Farm> getFarmById(@PathVariable Long id) {
        Optional<Farm> farm = farmService.getFarmById(id);
        if (farm.isPresent()) {
            return ResponseEntity.ok(farm.get());
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<Farm>> getAllFarms() {
        List<Farm> farms = farmService.getAllFarms();
        return ResponseEntity.ok(farms);
    }
}

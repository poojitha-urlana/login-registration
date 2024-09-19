package com.farming.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farming.Model.Farm;

@Repository
public interface FarmRepository extends JpaRepository<Farm, Long> {
    // Additional custom queries can be defined here
}

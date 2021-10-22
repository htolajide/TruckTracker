package com.claritae.trucktracker.repository;

import com.claritae.trucktracker.entity.Tracker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackerRepository extends JpaRepository<Tracker, Long> {
    
}

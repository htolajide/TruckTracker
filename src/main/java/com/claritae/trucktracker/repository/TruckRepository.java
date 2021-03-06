package com.claritae.trucktracker.repository;

import java.util.List;

import com.claritae.trucktracker.entity.Truck;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TruckRepository extends JpaRepository<Truck, Long> {
    List<Truck> findByTruckPlateContaining(String tructPlate);
    Truck findByTruckPlate(String truckPlate);
    Page<Truck> findAll(Pageable pageable);
}

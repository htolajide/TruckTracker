package com.claritae.trucktracker.repository;

import java.util.Optional;

import com.claritae.trucktracker.entity.InspectionLog;
import com.claritae.trucktracker.entity.Truck;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InspectionLogRepository extends JpaRepository<InspectionLog, Long> {
    Page<InspectionLog> findAll(Pageable pageable);
    Optional<InspectionLog> findByTruck(Truck truck);
}

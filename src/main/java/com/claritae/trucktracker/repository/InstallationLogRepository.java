package com.claritae.trucktracker.repository;

import com.claritae.trucktracker.entity.InstallationLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstallationLogRepository extends JpaRepository<InstallationLog, Long> {
    
}

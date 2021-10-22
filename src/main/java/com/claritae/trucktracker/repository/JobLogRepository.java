package com.claritae.trucktracker.repository;

import com.claritae.trucktracker.entity.JobLog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobLogRepository extends JpaRepository<JobLog, Long> {
    
}

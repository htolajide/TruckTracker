package com.claritae.trucktracker.repository;

import com.claritae.trucktracker.entity.ResourceLink;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceLinkRepository extends JpaRepository<ResourceLink, Long> {
    
}

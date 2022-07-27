package com.dev.tour.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.tour.models.Site;

public interface SiteRepository extends JpaRepository<Site, Integer> {
    
}

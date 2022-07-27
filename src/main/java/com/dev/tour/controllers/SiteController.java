package com.dev.tour.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dev.tour.models.Site;
import com.dev.tour.repositories.SiteRepository;

@RestController
public class SiteController {
    
    private SiteRepository siteRepository;

    public SiteController(SiteRepository siteRepository){
        this.siteRepository = siteRepository;
    }

    @PostMapping("/sites")
    public Site addNewSite(@RequestBody Site newSite){
        return siteRepository.save(newSite);
    }

    @GetMapping("/sites")
    public List<Site> getAllSites(){
        return siteRepository.findAll();
    }

    @DeleteMapping("/sites/{id}")
    public void deleteSite(@PathVariable int id){
        siteRepository.deleteById(id);
    }

    // Update

    // get by id
}

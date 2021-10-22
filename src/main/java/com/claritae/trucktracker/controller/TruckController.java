package com.claritae.trucktracker.controller;

import java.util.List;

import com.claritae.trucktracker.entity.Truck;
import com.claritae.trucktracker.service.TruckService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/truck")
@Validated
public class TruckController {
    @Autowired
    private TruckService truckService;
    @PostMapping("/save")
    public HttpEntity<Truck> saveTruck(@Validated @RequestBody Truck truck){
        return truckService.saveTruck(truck);
    }

    @PutMapping("/update/{plate}")
    public HttpEntity<Truck> updateTruck(@Validated @RequestBody Truck truck, @PathVariable String plate){
        return truckService.updateTruck(truck, plate);
    }


    @GetMapping("/page/{page}")
    public HttpEntity<Page<Truck>> findAllByPage(@PathVariable int page){
        return truckService.findAllTrucks(page);
    }

    @GetMapping("/{plate}")
    public HttpEntity<List<Truck>> findAllContainingPlate(@PathVariable String plate){
        return truckService.findAllContainingTruckPlate(plate);
    }
}

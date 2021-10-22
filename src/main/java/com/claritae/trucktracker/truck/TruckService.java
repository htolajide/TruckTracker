package com.claritae.trucktracker.truck;

import java.time.LocalDateTime;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TruckService {
    @Autowired
    private TruckRepository truckRepository;

    public HttpEntity<Truck> saveTruck(Truck truck){
        Truck savedTruck = truckRepository.save(truck);
        return new ResponseEntity<Truck>(savedTruck, HttpStatus.OK);
    }
    @Transactional
    public HttpEntity<Truck> updateTruck(Truck truck, String plate){
        Truck savedTruck = truckRepository.findByTruckPlate(plate);
        savedTruck.setRegion(truck.getRegion());
        savedTruck.setTransporter(truck.getTransporter());
        savedTruck.setTruckType(truck.getTruckType());
        savedTruck.setTruckPlate(truck.getTruckPlate());
        savedTruck.setUpdatedAt(LocalDateTime.now());
        return new ResponseEntity<Truck>(savedTruck, HttpStatus.OK);
    }

    public HttpEntity<List<Truck>> findAllContainingTruckPlate(String plate){
        List<Truck> trucks = truckRepository.findByTruckPlateContaining(plate);
        return new ResponseEntity<List<Truck>>(trucks, HttpStatus.OK);
    }

    public HttpEntity<Page<Truck>> findAllTrucks(int page){
        int size = 10;
        Pageable pages = PageRequest.of(page, size);
        Page<Truck> trucks = truckRepository.findAll(pages);
        return new ResponseEntity<Page<Truck>>(trucks, HttpStatus.OK);
    }
}

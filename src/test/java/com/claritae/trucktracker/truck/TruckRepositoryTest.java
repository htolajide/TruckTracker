package com.claritae.trucktracker.truck;

import com.claritae.trucktracker.utility.Region;
import com.claritae.trucktracker.utility.Transporter;
import com.claritae.trucktracker.utility.TruckType;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TruckRepositoryTest {
    @Autowired
    private TruckRepository truckRepository;

    @Test
    public void saveTruck(){
        Truck truck = Truck.builder()
            .truckPlate("XA678AKD")
            .transporter(Transporter.ABC)
            .region(Region.SOUTH)
            .truckType(TruckType.SCANIA)
            .build();
        truckRepository.save(truck);
    }
}

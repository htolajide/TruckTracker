package com.claritae.trucktracker.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.claritae.trucktracker.utility.ActionTime;
import com.claritae.trucktracker.utility.Region;
import com.claritae.trucktracker.utility.Transporter;
import com.claritae.trucktracker.utility.TruckType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@EqualsAndHashCode(callSuper = false)
@Table(name="Truck")
public class Truck extends ActionTime{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long TruckId;

    @Column(name = "truck_plate", length = 50, nullable = false)
    private String truckPlate;

    @Enumerated(EnumType.STRING)
    @Column(name = "transporter", nullable = false)
    private Transporter transporter;

    @Enumerated(EnumType.STRING)
    @Column(name = "region", nullable = false)
    private Region region;

    @Enumerated(EnumType.STRING)
    @Column(name = "truck_type", nullable = false)
    private TruckType truckType;
    
}

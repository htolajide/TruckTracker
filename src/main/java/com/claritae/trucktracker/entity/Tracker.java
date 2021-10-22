package com.claritae.trucktracker.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.claritae.trucktracker.utility.ActionTime;

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
public class Tracker extends ActionTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trackerId;

    @Column(name="device_imei", length = 20, nullable = false, unique = true)
    private String imei;
}

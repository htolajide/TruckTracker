package com.claritae.trucktracker.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.claritae.trucktracker.utility.ActionTime;
import com.claritae.trucktracker.utility.PersonType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
public class Person extends ActionTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personId;
    @Column(name = "full_name", length = 45, nullable = false)
    private String fullName;
    @Column(name = "phone", length = 20, nullable = false)
    private String phone;
    @Column(name = "address", length = 45)
    private String email;
    @Column(name = "person_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private PersonType personType;
}

package com.claritae.trucktracker.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.claritae.trucktracker.utility.ActionTime;
import com.claritae.trucktracker.utility.LogType;


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
@Table(name = "image_resource")
public class ImageResource extends ActionTime{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long resourceId;

    @OneToMany(mappedBy="imageResource")
    private List<ResourceLink> resourceLinks; 

    @Enumerated(EnumType.STRING)
    @Column(name = "log_type")
    private LogType logType;
    
}

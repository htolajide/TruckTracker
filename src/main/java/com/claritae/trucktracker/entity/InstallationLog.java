package com.claritae.trucktracker.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.claritae.trucktracker.utility.ActionTime;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@Builder
@Table(name = "installation_log")
public class InstallationLog extends ActionTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long logId;
    
    @OneToOne(optional = false)
    @JoinColumn(name = "tracker_id", nullable = false, referencedColumnName = "trackerId")
    @JsonProperty("tracker_id")
    private Tracker traker;

    @ManyToOne(
        cascade = CascadeType.ALL,
        fetch = FetchType.EAGER
    )
    @JoinColumn(
        name = "truck_id", 
        referencedColumnName = "truckId"
    )
    private Truck truck;

    @Column(name = "electrician")
    private Person electrician;
    @Column(name = "supervisor")
    private Person supervisor;
    @Column(name = "fitter")
    private Person fitter;
    
    @OneToMany(
        cascade = CascadeType.ALL,
        fetch = FetchType.EAGER
    )
    @JoinColumn(
        name = "log_id",
        referencedColumnName = "logId"
    )
    private List<ImageResource> imageResource; 
}

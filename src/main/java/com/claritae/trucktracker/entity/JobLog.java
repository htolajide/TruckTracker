package com.claritae.trucktracker.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.claritae.trucktracker.utility.ActionTime;
import com.claritae.trucktracker.utility.LogStatus;

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
@Table(name = "job_log")

public class JobLog extends ActionTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long logId;

    @ManyToOne(
        cascade = CascadeType.ALL,
        fetch = FetchType.EAGER
    )
    @JoinColumn(
        name = "truck_id", 
        referencedColumnName = "truckId"
    )
    private Truck truck;

    @Enumerated(EnumType.STRING)
    @Column(name="status")
    private LogStatus logStatus;

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

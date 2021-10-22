package com.claritae.trucktracker.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResourceLink {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  linkId;

    @Column(name="link")
    private String link;

    @ManyToOne
    @JoinColumn(name="resource_id", nullable=false)
    private ImageResource imageResource;
}

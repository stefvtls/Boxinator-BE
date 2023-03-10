package com.experis.boxinator.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "Country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String countryName;

    @Column
    private int multiplier;

    @Column
    private int latitude;

    @Column
    private int longitude;

    @Column
    private int distance;

    @OneToMany(mappedBy = "country")
    private Set<Shipment> shipments;
}

package com.experis.boxinator.models;

import com.experis.boxinator.models.enums.ShipmentStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Shipment")
public class Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ShipmentStatus shipmentStatus;

    @Column
    private String destinationAddress;

    @Column
    private String boxColour;

    @Column
    private int weightOption;

    @Column
    private int cost;
}

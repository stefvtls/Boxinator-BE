package com.experis.boxinator.models.dtos;

import lombok.Data;

@Data
public class ShipmentDTO {
    private Long id;
    private String destinationAddress, boxColour;
    private int weightOption, cost;
    private Integer shipmentStatus;
    private Integer sender;
    private Integer country;
}

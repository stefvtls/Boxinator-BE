package com.experis.boxinator.models.dtos;

import lombok.Data;

import java.util.Set;

@Data
public class CountryDTO {
    private Long id;
    private String countryName;
    private int multiplier, latitude, longitude, distance;
    private Set<Integer> shipments;
}

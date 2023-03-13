package com.experis.boxinator.models.dtos;

import lombok.Data;

import java.util.Set;

@Data
public class SenderDTO {
    private Long id;
    private String email;
    private Integer role;
    private Integer account;
    private Set<Integer> shipments;
}

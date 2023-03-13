package com.experis.boxinator.models.dtos;

import com.experis.boxinator.models.Sender;
import lombok.Data;

import java.util.Date;

@Data
public class AccountDTO {
    private Long id, phoneNumber;
    private String firstName, lastName, subId, country, zipCode;
    private Date dateOfBirth, createdAt;
    private Integer sender;
}

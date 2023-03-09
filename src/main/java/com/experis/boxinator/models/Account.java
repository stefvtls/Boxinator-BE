package com.experis.boxinator.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private Long id;

    @Column(length = 100, nullable = false)
    private String firstName;

    @Column(length = 100, nullable = false)
    private String lastName;

    @Column
    private String subId;

    @Column
    private Date dateOfBirth;

    @Column
    private String country;

    @Column
    private String zipCode;

    @Column
    private Long phoneNumber;

    @Column
    private Date createdAt = new Date();
    }



package com.experis.boxinator.models;

import com.experis.boxinator.models.enums.Role;
import com.experis.boxinator.models.enums.ShipmentStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "Sender")
public class Sender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @OneToOne
    private Account account;

    @OneToMany(mappedBy = "sender")
    private Set<Shipment> shipments;
}

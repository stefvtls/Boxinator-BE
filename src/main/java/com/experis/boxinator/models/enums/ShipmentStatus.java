package com.experis.boxinator.models.enums;

public enum ShipmentStatus {
    CREATED(1),
    RECEIVED(2),
    IN_TRANSIT(3),
    COMPLETED(4),
    CANCELLED(5);

    private final Long id;

    ShipmentStatus(long id) { this.id = id; }

    public Long getValue() { return id; }
}

//package com.experis.boxinator.repositories;
//
//import com.experis.boxinator.models.Shipment;
//import com.experis.boxinator.models.enums.Role;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.Collection;
//import java.util.Optional;
//
//@Repository
//public interface ShipmentRepository extends JpaRepository<Shipment, Long> {
//    Optional<Shipment> findBySender(Long id);
//    // Method that returns list of all COMPLETED shipments
//    Collection<Shipment> findAllCompleted(Role role);
//
//}

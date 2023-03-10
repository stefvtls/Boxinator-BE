//package com.experis.boxinator.services.shipment;
//
//import com.experis.boxinator.models.Shipment;
//import com.experis.boxinator.models.enums.Role;
//import com.experis.boxinator.models.enums.ShipmentStatus;
//import com.experis.boxinator.repositories.ShipmentRepository;
//import org.springframework.stereotype.Service;
//
//import java.util.Collection;
//import java.util.Optional;
//
//@Service
//public class ShipmentServiceImpl implements ShipmentService {
//    private final ShipmentRepository shipmentRepository;
//
//    public ShipmentServiceImpl(ShipmentRepository shipmentRepository){
//        this.shipmentRepository = shipmentRepository;
//    }
//    @Override
//    public Shipment findById(Long id) {
//        return shipmentRepository.getReferenceById(id);
//    }
//
//    @Override
//    public Collection<Shipment> findAll() {
//        return shipmentRepository.findAll();
//    }
//
//    @Override
//    public Shipment add(Shipment entity) {
//        return shipmentRepository.save(entity);
//    }
//
//    @Override
//    public Shipment update(Shipment entity) {
//        return shipmentRepository.saveAndFlush(entity);
//    }
//
//    @Override
//    public void deleteById(Long id) {shipmentRepository.deleteById(id);}
//
//    @Override
//    public boolean exists(Long id) {
//        return shipmentRepository.existsById(id);
//    }
//
//    public Shipment findBySender(Long id){ return shipmentRepository.findBySender(id).orElseThrow(() -> new RuntimeException("Shipment not found with id " + id));}
//    public Shipment findAllCompleted(ShipmentStatus status, Role role){
//        return null;
//    }
//
//
//}

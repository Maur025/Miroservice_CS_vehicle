package com.customersupport.vehicle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customersupport.vehicle.entities.Vehicle;
import com.customersupport.vehicle.persistence.VehicleRepository;

@Service

public class VehicleServiceImplement implements IVehicleService {
    @Autowired
    private VehicleRepository vehicleRepository;

    public List<Vehicle> findAll() {
        return (List<Vehicle>) vehicleRepository.findAll();
    }

    public Vehicle findById(Long id) {
        return vehicleRepository.findById(id).orElseThrow();
    }

    public void save(Vehicle vehicle) {
        vehicleRepository.save(vehicle);
    }

    public List<Vehicle> findByIdClient(Long idClient) {
        return vehicleRepository.findAllVehicles(idClient);
    }
}

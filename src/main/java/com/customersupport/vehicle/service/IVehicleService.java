package com.customersupport.vehicle.service;

import java.util.List;

import com.customersupport.vehicle.entities.Vehicle;

public interface IVehicleService {
    List<Vehicle> findAll();

    Vehicle findById(Long id);

    void save(Vehicle vehicle);

    List<Vehicle> findByIdClient(Long idClient);
}

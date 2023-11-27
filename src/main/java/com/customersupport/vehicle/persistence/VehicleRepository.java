package com.customersupport.vehicle.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.customersupport.vehicle.entities.Vehicle;

@Repository

public interface VehicleRepository extends CrudRepository<Vehicle, Long> {

    @Query("SELECT veh FROM Vehicle veh WHERE veh.clientId = :idClient")
    List<Vehicle> findAllVehicles(Long idClient);
}

package com.customersupport.vehicle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.customersupport.vehicle.entities.Vehicle;
import com.customersupport.vehicle.service.IVehicleService;

@RestController
@RequestMapping("/api/vehicle")

public class VehicleController {

    @Autowired
    private IVehicleService vehicleService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveVehicle(@RequestBody Vehicle vehicle) {
        vehicleService.save(vehicle);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllVehicle() {
        return ResponseEntity.ok(vehicleService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(vehicleService.findById(id));
    }

    @GetMapping("/search_by_client/{idClient}")
    public ResponseEntity<?> findByIdClient(@PathVariable Long idClient) {
        return ResponseEntity.ok(vehicleService.findByIdClient(idClient));
    }
}

package com.example.clientmanagementsystem.service;

import com.example.clientmanagementsystem.entity.Vehicle;

import java.util.List;

public interface VehicleService {
    List<Vehicle> getAllVehicles();

    Vehicle saveVehicle(Vehicle vehicle);

    Vehicle getVehicleById(Long id);

   Vehicle updateVehicle(Vehicle vehicle);

    void deleteVehicleById(Long id);
}

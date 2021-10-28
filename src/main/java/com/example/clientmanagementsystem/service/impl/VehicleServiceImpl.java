package com.example.clientmanagementsystem.service.impl;

import com.example.clientmanagementsystem.entity.Vehicle;
import com.example.clientmanagementsystem.repository.VehiclesRepository;
import com.example.clientmanagementsystem.service.VehicleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {
    private VehiclesRepository vehiclesRepository;

    public VehicleServiceImpl(VehiclesRepository vehiclesRepository) {
        this.vehiclesRepository = vehiclesRepository;
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        return vehiclesRepository.findAll();
    }

    @Override
    public Vehicle saveVehicle(Vehicle vehicle) {
        return vehiclesRepository.save(vehicle);
    }

    @Override
    public Vehicle getVehicleById(Long id) {
        return vehiclesRepository.findById(id).get();
    }

    @Override
    public Vehicle updateVehicle(Vehicle vehicle) {
        return vehiclesRepository.save(vehicle);
    }

    @Override
    public void deleteVehicleById(Long id) {
        vehiclesRepository.deleteById(id);
    }
}

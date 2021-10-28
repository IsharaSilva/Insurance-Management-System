package com.example.clientmanagementsystem.repository;

import com.example.clientmanagementsystem.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiclesRepository extends JpaRepository<Vehicle, Long> {
}

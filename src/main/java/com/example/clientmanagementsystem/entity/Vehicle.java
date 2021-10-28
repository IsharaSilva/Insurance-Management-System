package com.example.clientmanagementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehicles")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "vehicleModel", nullable = false)
    private String vehicleModel;

    @Column(name = "vehicleRegisteredState")
    private String vehicleRegisteredState;

    @Column(name = "clientID")
    private Integer clientID;

    public Vehicle() {

    }

    public Vehicle(String vehicleModel, String vehicleRegisteredState, Integer clientID) {
        super();
        this.vehicleModel = vehicleModel;
        this.vehicleRegisteredState = vehicleRegisteredState;
        this.clientID = clientID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleRegisteredState() {
        return vehicleRegisteredState;
    }

    public void setVehicleRegisteredState(String vehicleRegisteredState) {
        this.vehicleRegisteredState = vehicleRegisteredState;
    }

    public Integer getClientID() {
        return clientID;
    }

    public void setClientID(Integer clientID) {
        this.clientID = clientID;
    }
}
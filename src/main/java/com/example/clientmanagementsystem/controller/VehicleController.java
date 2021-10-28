package com.example.clientmanagementsystem.controller;

import com.example.clientmanagementsystem.entity.Vehicle;
import com.example.clientmanagementsystem.service.VehicleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VehicleController {
    private VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {

        this.vehicleService = vehicleService;
    }

    //handler method to handle list of clients
    @GetMapping("/vehicles")
    public String listVehicles(Model model) {
        model.addAttribute("vehicles", vehicleService.getAllVehicles());
        return "vehicles";
    }

    //adding new client
    @GetMapping("/vehicles/new")
    public String createVehicleForm(Model model) {
        Vehicle vehicle = new Vehicle();
        model.addAttribute("vehicle", vehicle);
        return "create_vehicle";
    }

    @PostMapping("/vehicles")
    public String saveVehicle(@ModelAttribute("vehicle") Vehicle vehicle) {
        vehicleService.saveVehicle(vehicle);
        return "redirect:/vehicles";
    }

    //update
    @GetMapping("/vehicles/edit/{id}")
    public String editClientForm(@PathVariable Long id, Model model) {
        model.addAttribute("vehicle", vehicleService.getVehicleById(id));
        return "edit_vehicle";
    }

    @PostMapping("/vehicles/{id}")
    public String updateVehicle(@PathVariable Long id, @ModelAttribute("vehicle") Vehicle vehicle, Model model) {
        //get client from database by id
       Vehicle existingVehicle = (Vehicle) vehicleService.getVehicleById(id);
        existingVehicle.setId(id);
        existingVehicle.setVehicleModel(vehicle.getVehicleModel());
        existingVehicle.setVehicleRegisteredState(vehicle.getVehicleRegisteredState());
        existingVehicle.setClientID(vehicle.getClientID());

        //save updated client object
        vehicleService.updateVehicle(existingVehicle);
        return "redirect:/vehicles";
    }

    //deleting
    @GetMapping("vehicles/{id}")
    public String deleteVehicle(@PathVariable Long id) {
        vehicleService.deleteVehicleById(id);
        return "redirect:/vehicles";
    }
}

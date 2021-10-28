package com.example.clientmanagementsystem.controller;

import com.example.clientmanagementsystem.entity.Client;
import com.example.clientmanagementsystem.service.ClientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClientController {
    private ClientService clientService;

    public ClientController(ClientService clientService) {

        this.clientService = clientService;
    }
    @GetMapping ("/")
    public String index() {
        return "Index";
    }
    //handler method to handle list of clients
    @GetMapping("/clients")
    public String listClients(Model model) {
        model.addAttribute("clients", clientService.getAllClients());
        return "clients";
    }

    //adding new client
    @GetMapping("/clients/new")
    public String createClientForm(Model model) {
        Client client = new Client();
        model.addAttribute("client", client);
        return "create_client";
    }

    @PostMapping("/clients")
    public String saveClient(@ModelAttribute("client") Client client) {
        clientService.saveClient(client);
        return "redirect:/clients";
    }

    //update
    @GetMapping("/clients/edit/{id}")
    public String editClientForm(@PathVariable Long id, Model model) {
        model.addAttribute("client", clientService.getClientById(id));
        return "edit_client";
    }

    @PostMapping("/clients/{id}")
    public String updateClient(@PathVariable Long id, @ModelAttribute("client") Client client, Model model) {
        //get client from database by id
       Client existingClient = (Client) clientService.getClientById(id);
        existingClient.setId(id);
        existingClient.setName(client.getName());
        existingClient.setAddress(client.getAddress());
        existingClient.setEmail(client.getEmail());
        existingClient.setVehicleNumber((client.getVehicleNumber()));

        //save updated client object
        clientService.updateClient(existingClient);
        return "redirect:/clients";
    }

    //deleting
    @GetMapping("clients/{id}")
    public String deleteClient(@PathVariable Long id) {
        clientService.deleteClientById(id);
        return "redirect:/clients";
    }
}

package com.example.clientmanagementsystem.service;

import com.example.clientmanagementsystem.entity.Client;

import java.util.List;

public interface ClientService {
    List<Client> getAllClients();

    Client saveClient(Client client);

    Client getClientById(Long id);

   Client updateClient(Client client);

    void deleteClientById(Long id);
}

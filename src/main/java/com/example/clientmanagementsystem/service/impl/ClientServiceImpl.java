package com.example.clientmanagementsystem.service.impl;

import com.example.clientmanagementsystem.entity.Client;
import com.example.clientmanagementsystem.repository.ClientsRepository;
import com.example.clientmanagementsystem.service.ClientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    private ClientsRepository clientsRepository;

    public ClientServiceImpl(ClientsRepository clientsRepository) {
        this.clientsRepository = clientsRepository;
    }

    @Override
    public List<Client> getAllClients() {
        return clientsRepository.findAll();
    }

    @Override
    public Client saveClient(Client client) {
        return clientsRepository.save(client);
    }

    @Override
    public Client getClientById(Long id) {
        return clientsRepository.findById(id).get();
    }

    @Override
    public Client updateClient(Client client) {
        return clientsRepository.save(client);
    }

    @Override
    public void deleteClientById(Long id) {
        clientsRepository.deleteById(id);
    }
}

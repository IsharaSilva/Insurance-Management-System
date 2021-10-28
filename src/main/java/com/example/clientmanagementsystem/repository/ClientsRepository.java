package com.example.clientmanagementsystem.repository;

import com.example.clientmanagementsystem.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientsRepository extends JpaRepository<Client, Long> {
}

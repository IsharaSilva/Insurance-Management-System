package com.example.clientmanagementsystem.repository;

import com.example.clientmanagementsystem.entity.Policy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicysRepository extends JpaRepository<Policy, Long> {
}

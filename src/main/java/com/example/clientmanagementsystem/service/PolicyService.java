package com.example.clientmanagementsystem.service;

import com.example.clientmanagementsystem.entity.Policy;

import java.util.List;

public interface PolicyService {
    List<Policy> getAllPolicys();

    Policy savePolicy(Policy policy);

    Policy getPolicyById(Long id);

   //Policy updatePolicy(Policy policy);

    void deletePolicyById(Long id);

}

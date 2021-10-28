package com.example.clientmanagementsystem.service.impl;

import com.example.clientmanagementsystem.entity.Policy;
import com.example.clientmanagementsystem.repository.PolicysRepository;
import com.example.clientmanagementsystem.service.PolicyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyServiceImpl implements PolicyService {
    private PolicysRepository policysRepository;

    public PolicyServiceImpl(PolicysRepository policysRepository) {
        this.policysRepository = policysRepository;
    }

    @Override
    public List<Policy> getAllPolicys() {
        return policysRepository.findAll();
    }

    @Override
    public Policy savePolicy(Policy policy) {
        return policysRepository.save(policy);
    }

    @Override
    public Policy getPolicyById(Long id) {
        return policysRepository.findById(id).get();
    }

   // @Override
    //public Policy updatePolicy(Policy policy) {
        //return policysRepository.save(policy);
    //}

    @Override
    public void deletePolicyById(Long id) {
        policysRepository.deleteById(id);
    }
}

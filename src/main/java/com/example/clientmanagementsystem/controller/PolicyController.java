package com.example.clientmanagementsystem.controller;

import com.example.clientmanagementsystem.entity.Policy;
import com.example.clientmanagementsystem.service.PolicyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PolicyController {
    private PolicyService policyService;

    public PolicyController(PolicyService policyService) {

        this.policyService = policyService;
    }

    //handler method to handle list of policys
    @GetMapping("/policys")
    public String listPolicys(Model model) {
        model.addAttribute("policys", policyService.getAllPolicys());
        return "policys";
    }

    //adding new policy
    @GetMapping("/policys/new")
    public String createPolicyForm(Model model) {
        Policy policy = new Policy();
        model.addAttribute("policy", policy);
        return "create_policy";
    }

    @PostMapping("/policys")
    public String savePolicy(@ModelAttribute("policy") Policy policy) {
        policyService.savePolicy(policy);
        return "redirect:/policys";
    }

    //update
    @GetMapping("/policys/edit/{id}")
    public String editPolicyForm(@PathVariable Long id, Model model) {
        model.addAttribute("policy", policyService.getPolicyById(id));
        return "edit_client";
    }



    //deleting
    @GetMapping("policys/{id}")
    public String deletePolicy(@PathVariable Long id) {
        policyService.deletePolicyById(id);
        return "redirect:/policys";
    }
}

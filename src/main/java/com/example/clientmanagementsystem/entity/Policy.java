package com.example.clientmanagementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "policys")
public class Policy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "policyType", nullable = false)
    private String policyType;

    @Column(name = "timeperiod")
    private String timeperiod;

    @Column(name = "totalAmount")
    private String totalAmount;

    @Column(name="paymentOption")
    private String paymentOption;

    public Policy() {

    }

    public Policy(String policyType, String timeperiod, String totalAmount, String paymentOption) {
        super();
        this.policyType = policyType;
        this.timeperiod = timeperiod;
        this.totalAmount = totalAmount;
        this.paymentOption= paymentOption;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public String getTimeperiod() {
        return timeperiod;
    }

    public void setTimeperiod(String timeperiod) {
        this.timeperiod = timeperiod;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPaymentOption() {
        return paymentOption;
    }

    public void setPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
    }
}
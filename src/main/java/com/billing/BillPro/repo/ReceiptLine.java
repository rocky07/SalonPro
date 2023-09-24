package com.billing.BillPro.repo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ReceiptLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name="receipt_line_id")
    private int id;
    private String service;
    private String serviceCost;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public String getService() {
        return service;
    }
    public void setService(String service) {
        this.service = service;
    }
    public String getServiceCost() {
        return serviceCost;
    }
    public void setServiceCost(String serviceCost) {
        this.serviceCost = serviceCost;
    }
    
}

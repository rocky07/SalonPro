package com.billing.BillPro.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.billing.BillPro.repo.Receipt;
import com.billing.BillPro.repo.ReceiptRepo;
import com.billing.BillPro.repo.ServiceRepo;
import com.billing.BillPro.repo.Services;

@RestController
public class DataController {

    @Autowired
    ServiceRepo serviceRepo; // Corrected the field name
    @Autowired
    ReceiptRepo receiptRepo;

    @GetMapping("/services")
    public List<Services> getService() {
        List<Services> serviceList=serviceRepo.findAll();
        if (serviceList.isEmpty()) {
            throw new RuntimeException("empty list");
        }
        return serviceList;
    }

    @PostMapping("/services") // Added the request mapping URL
    public void setService(@RequestBody Services service) { // Added @RequestBody annotation
        serviceRepo.save(service);
    }

    @PostMapping("/receipt") // Added the request mapping URL
    public void addReceipt(@RequestBody Receipt receipt) { // Added @RequestBody annotation
        receiptRepo.save(receipt);
    }
     @GetMapping("/receipt")
    public List<Receipt> getReceipt() {
        List<Receipt> receiptList=receiptRepo.findAll();
        if (receiptList.isEmpty()) {
            throw new RuntimeException("empty list");
        }
        return receiptList;
    }

}

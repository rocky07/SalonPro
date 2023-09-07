package com.billing.BillPro.repo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Receipt {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String receiptNumber;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ReceiptLine> receiptLines;
    private Double total;
    private Double tax;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getReceiptNumber() {
        return receiptNumber;
    }
    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }
    public List<ReceiptLine> getReceiptLines() {
        return receiptLines;
    }
    public void setReceiptLines(List<ReceiptLine> receiptLines) {
        this.receiptLines = receiptLines;
    }
    public Double getTotal() {
        return total;
    }
    public void setTotal(Double total) {
        this.total = total;
    }
    public Double getTax() {
        return tax;
    }
    public void setTax(Double tax) {
        this.tax = tax;
    }
    
}

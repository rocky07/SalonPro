package com.billing.BillPro.repo;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Receipt {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="receipt_id")
    private int id;
    private String receiptNumber;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name="fk_rec_line",referencedColumnName = "receipt_id" )
    private List<ReceiptLine> receiptLines;
    @OneToOne
    @JoinColumn(name="fk_rec_user",referencedColumnName = "user_id")
    private User user;
    private Double total;
    private Double tax;
    private String recordsStatus;
    private Date date;

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
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public String getRecordsStatus() {
        return recordsStatus;
    }
    public void setRecordsStatus(String recordsStatus) {
        this.recordsStatus = recordsStatus;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    
    
}

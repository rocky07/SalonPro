package com.billing.BillPro.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ReceiptRepo extends JpaRepository<Receipt,Integer>{
    
}

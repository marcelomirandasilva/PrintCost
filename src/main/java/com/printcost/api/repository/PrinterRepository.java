package com.printcost.api.repository;

import com.printcost.api.domain.Printer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrinterRepository extends JpaRepository<Printer, Long> {
    
}
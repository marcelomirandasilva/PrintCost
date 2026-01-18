package com.printcost.api.domain;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

// 1. ANOTAÇÕES LOMBOK 
@Getter 
@Setter 
@NoArgsConstructor 
@AllArgsConstructor 
@EqualsAndHashCode(of = "id") 
@Builder 

// 2. ANOTAÇÕES JPA 
@Entity 
@Table(name = "printers") 
public class Printer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;

    @Column(nullable = false) 
    private String name; 

    @Column(nullable = false)
    private String model; 

    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PrinterType type; // FDM ou RESIN

   
    @Column(name = "price_per_kwh", precision = 10, scale = 4)
    private BigDecimal powerConsumptionWatts; // Ex: 300W

    @Column(name = "purchase_price", precision = 19, scale = 2)
    private BigDecimal purchasePrice; // Ex: R$ 3500.00

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    // 3. LIFECYCLE CALLBACKS (Automagic do JPA)
    @PrePersist
    public void prePersist() {
        this.createdAt = LocalDateTime.now();
    }

    @PreUpdate 
    public void preUpdate() {
        this.updatedAt = LocalDateTime.now();
    }
}
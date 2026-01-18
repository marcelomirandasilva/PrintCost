package com.printcost.api.dto;

import com.printcost.api.domain.PrinterType;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class PrinterResponseDTO {
   private Long id;
   private String name;
   private String model;
   private PrinterType type;
   private BigDecimal powerConsumptionWatts;
   private BigDecimal purchasePrice;
}
package com.printcost.api.dto;

import com.printcost.api.domain.PrinterType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

import java.math.BigDecimal;

@Data 
public class PrinterRequestDTO {

    @NotBlank(message = "O nome da impressora é obrigatório")
    private String name;

    @NotBlank(message = "O modelo é obrigatório")
    private String model;

    @NotNull(message = "O tipo é obrigatório: FDM ou RESIN")
    private PrinterType type; 

    @NotNull(message = "A potência (Watts) é obrigatória")
    @Positive(message = "A potência deve ser maior que zero")
    private BigDecimal powerConsumptionWatts;

    @NotNull(message = "O preço de compra é obrigatório")
    @PositiveOrZero(message = "O valor não pode ser negativo")
    private BigDecimal purchasePrice;
}
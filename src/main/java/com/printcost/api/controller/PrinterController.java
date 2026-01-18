package com.printcost.api.controller;

import com.printcost.api.domain.Printer;
import com.printcost.api.dto.PrinterRequestDTO;
import com.printcost.api.dto.PrinterResponseDTO;
import com.printcost.api.service.PrinterService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/printers")
@RequiredArgsConstructor // Injeção de dependência do Service via construtor
public class PrinterController {

    private final PrinterService service;

   @PostMapping
    // Note o <PrinterResponseDTO> no ResponseEntity
    public ResponseEntity<PrinterResponseDTO> create(@RequestBody @Valid PrinterRequestDTO dto) {
        
        PrinterResponseDTO createdPrinter = service.create(dto);
        
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPrinter);
    }
}
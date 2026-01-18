package com.printcost.api.service;

import com.printcost.api.domain.Printer;
import com.printcost.api.dto.PrinterRequestDTO;
import com.printcost.api.repository.PrinterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PrinterService {

    private final PrinterRepository repository;

    public Printer create(PrinterRequestDTO dto) {
        Printer printer = new Printer();
        printer.setName(dto.getName());
        printer.setModel(dto.getModel());
        printer.setType(dto.getType());
        printer.setPowerConsumptionWatts(dto.getPowerConsumptionWatts());
        printer.setPurchasePrice(dto.getPurchasePrice());

      
        return repository.save(printer);
    }
}
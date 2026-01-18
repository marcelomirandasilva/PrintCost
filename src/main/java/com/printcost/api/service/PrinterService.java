package com.printcost.api.service;

import com.printcost.api.domain.Printer;
import com.printcost.api.dto.PrinterRequestDTO;
import com.printcost.api.dto.PrinterResponseDTO;
import com.printcost.api.repository.PrinterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PrinterService {

    private final PrinterRepository repository;

    public PrinterResponseDTO create(PrinterRequestDTO dto) {
        // 1. Converter DTO Entrada -> Entidade
        Printer printer = new Printer();
        printer.setName(dto.getName());
        printer.setModel(dto.getModel());
        printer.setType(dto.getType());
        printer.setPowerConsumptionWatts(dto.getPowerConsumptionWatts());

        printer.setPurchasePrice(dto.getPurchasePrice());

        // 2. Salvar no banco
        Printer savedPrinter = repository.save(printer);

        // 3. Converter Entidade -> DTO Saída (Mapeamento reverso)
        PrinterResponseDTO responseDTO = new PrinterResponseDTO();
        responseDTO.setId(savedPrinter.getId());
        responseDTO.setName(savedPrinter.getName());
        responseDTO.setModel(savedPrinter.getModel());
        responseDTO.setType(savedPrinter.getType());
        responseDTO.setPowerConsumptionWatts(savedPrinter.getPowerConsumptionWatts());
        responseDTO.setPurchasePrice(savedPrinter.getPurchasePrice());

        return responseDTO;
    }
}
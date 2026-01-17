package com.printcost.api; // Certifique-se que o pacote está correto

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    public String check() {
        return "PrintCost Pro: ON - Bora codar!";
    }
}
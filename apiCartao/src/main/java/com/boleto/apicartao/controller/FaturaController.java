package com.boleto.apicartao.controller;

import com.boleto.apicartao.model.Fatura;
import com.boleto.apicartao.service.FaturaService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faturas")
public class FaturaController {
    private final FaturaService faturaService;

    public FaturaController(FaturaService faturaService) {
        this.faturaService = faturaService;
    }

    @GetMapping
    public ResponseEntity<List<Fatura>> getFaturas() {
        List<Fatura> faturas = faturaService.findAll();
        return ResponseEntity.ok(faturas);
    }

    @PostMapping
    public ResponseEntity<Fatura> addFatura(@RequestBody @Valid Fatura fatura) {
        faturaService.save(fatura);
        return ResponseEntity.status(201).body(fatura);
    }
}

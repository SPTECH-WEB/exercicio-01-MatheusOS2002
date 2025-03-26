package com.boleto.apicartao.controller;

import com.boleto.apicartao.model.Fatura;
import com.boleto.apicartao.repository.FaturaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faturas")
public class FaturaController {
    private final FaturaRepository faturaRepository;

    public FaturaController(FaturaRepository faturaRepository) {
        this.faturaRepository = faturaRepository;
    }

    @GetMapping
    public List<Fatura> getFaturas() {
        return faturaRepository.findAll();
    }

    @PostMapping
    public Fatura addFatura(@RequestBody Fatura fatura) {
        return faturaRepository.save(fatura);
    }
}

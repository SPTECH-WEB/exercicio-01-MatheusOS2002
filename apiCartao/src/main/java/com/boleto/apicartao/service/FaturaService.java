package com.boleto.apicartao.service;

import com.boleto.apicartao.model.Fatura;
import com.boleto.apicartao.repository.FaturaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaturaService {
    private final FaturaRepository faturaRepository;
    public FaturaService(FaturaRepository faturaRepository) {this.faturaRepository = faturaRepository;}

    public List<Fatura> findAll() {
        return faturaRepository.findAll();
    }

    public Fatura save(Fatura fatura) {
        return faturaRepository.save(fatura);
    }
}

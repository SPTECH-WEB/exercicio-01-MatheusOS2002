package com.boleto.apicartao.repository;

import com.boleto.apicartao.model.Fatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FaturaRepository extends JpaRepository<Fatura, Long> {
}

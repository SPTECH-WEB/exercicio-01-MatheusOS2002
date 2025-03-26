package com.boleto.apicartao.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "Cartao")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Fatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "É obrigatório o número do cartão")
    @Pattern(regexp = "\\d{16}", message = "O cartão deve ter 16 números")
    private String numeroCartao;

    @NotBlank(message = "É obrigatório o número do cartão")
    @Size(min = 3, max = 100, message = "O nome deve conter entre 3 e 100 caracteres")
    private String nomeTitular;

    @NotNull
    @DecimalMin(value = "10.0", message = "O valor mínimo é 10")
    @DecimalMax(value = "5000.0", message = "O valor máximo é 5000")
    private Double valor;

    @NotNull
    @FutureOrPresent(message = "A data deve ser presente ou futura")
    private LocalDate dataPagamento;

    @NotBlank
    @Email
    private String emailContato;
}

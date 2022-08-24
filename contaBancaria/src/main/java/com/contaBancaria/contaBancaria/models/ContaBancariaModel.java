package com.contaBancaria.contaBancaria.models;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "conta")
public class ContaBancariaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(length = 20, nullable = false)
    private String numeroDaConta;

    @Column(length = 10, nullable = false)
    private String numeroDaAgencia;

    @Column(length = 100, nullable = false)
    private String nomeDoUsuario;

    @Column(length = 50)
    private BigDecimal saldoInicial;

    @Column(length = 10)
    private String movimentacaoDaConta;

    @Column(name = "valorDaMovimentacao", length = 50)
    private BigDecimal valorDaMovimentacao;

    @Column(name = "saldoAtual", length = 50)
    private BigDecimal saldoAtual;
}

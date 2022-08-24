package com.contaBancaria.contaBancaria.models.valoresDaConta;

import java.math.BigDecimal;

public interface ICalculaSaldo {
    public BigDecimal calculoSaldo(BigDecimal saldoInicial, BigDecimal valorDaOperacao);
}
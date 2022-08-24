package com.contaBancaria.contaBancaria.models.valoresDaConta;

import java.math.BigDecimal;

public class CalculaSaque implements ICalculaSaldo{

    @Override
    public BigDecimal calculoSaldo(BigDecimal saldoInicial, BigDecimal valorDaOperacao) {
        BigDecimal saldoComSaque = saldoInicial.subtract(valorDaOperacao);
        return saldoComSaque;
    }
}

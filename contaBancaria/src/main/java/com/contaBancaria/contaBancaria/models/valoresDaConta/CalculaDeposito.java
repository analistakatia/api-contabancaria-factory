package com.contaBancaria.contaBancaria.models.valoresDaConta;

import java.math.BigDecimal;

public class CalculaDeposito implements ICalculaSaldo{

    @Override
    public BigDecimal calculoSaldo(BigDecimal saldoInicial, BigDecimal valorDaOperacao) {
        BigDecimal saldoComDeposito = saldoInicial.add(valorDaOperacao);
        return saldoComDeposito;
    }
}

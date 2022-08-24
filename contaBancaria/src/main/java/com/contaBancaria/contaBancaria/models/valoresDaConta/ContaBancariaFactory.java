package com.contaBancaria.contaBancaria.models.valoresDaConta;

public class ContaBancariaFactory {

    public ICalculaSaldo calculaSaldo(String movimentacaoDaConta){
        if (movimentacaoDaConta.equalsIgnoreCase("DEPOSITO")){
            return new CalculaDeposito();
        }else if (movimentacaoDaConta.equalsIgnoreCase("SAQUE")){
            return new CalculaSaque();
        }
        return null;
    }
}

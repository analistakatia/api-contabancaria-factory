package com.contaBancaria.contaBancaria.services;

import com.contaBancaria.contaBancaria.models.ContaBancariaModel;
import com.contaBancaria.contaBancaria.models.valoresDaConta.ContaBancariaFactory;
import com.contaBancaria.contaBancaria.repositories.IContaBancariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ContaBancariaService {
    @Autowired
    private IContaBancariaRepository contaBancariaRepository;

    public List<ContaBancariaModel> buscarTodasAsContasBancarias() {
        return contaBancariaRepository.findAll();
    }

    public Optional<ContaBancariaModel> buscarIdContaBancaria(Long codigo) {
        return contaBancariaRepository.findById(codigo);
    }



    public ContaBancariaModel cadastrarContaBancaria(ContaBancariaModel contaBancariaModel, ContaBancariaFactory contaBancariaFactory) {
        BigDecimal saldo = contaBancariaFactory.calculaSaldo(contaBancariaModel.getMovimentacaoDaConta()).calculoSaldo(contaBancariaModel.getSaldoInicial(), contaBancariaModel.getValorDaMovimentacao());

        contaBancariaModel.getCodigo();
        contaBancariaModel.getNumeroDaConta();
        contaBancariaModel.getNumeroDaAgencia();
        contaBancariaModel.getNomeDoUsuario();
        contaBancariaModel.getSaldoInicial();
        contaBancariaModel.getMovimentacaoDaConta();
        contaBancariaModel.getValorDaMovimentacao();
        contaBancariaModel.setSaldoAtual(saldo);
        return contaBancariaRepository.save(contaBancariaModel);
    }

    public void deletarContaBancaria(Long codigo) {
        contaBancariaRepository.deleteById(codigo);
    }

}

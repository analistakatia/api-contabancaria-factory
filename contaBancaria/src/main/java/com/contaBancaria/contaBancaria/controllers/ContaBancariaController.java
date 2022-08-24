package com.contaBancaria.contaBancaria.controllers;

import com.contaBancaria.contaBancaria.models.ContaBancariaModel;
import com.contaBancaria.contaBancaria.models.valoresDaConta.ContaBancariaFactory;
import com.contaBancaria.contaBancaria.services.ContaBancariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Optional;

@RestController
public class ContaBancariaController {

    @Autowired
    private ContaBancariaService contaBancariaService;

    @GetMapping(path = "/contabancaria")
    public ResponseEntity<List<ContaBancariaModel>> buscarTodasAsContasBancarias(){
        return ResponseEntity.ok(contaBancariaService.buscarTodasAsContasBancarias());
    }

    @GetMapping(path = "/contabancaria/{codigo}")
    public ResponseEntity<Optional<ContaBancariaModel>> buscarIdDeContaBancaria(@PathVariable Long codigo){
        return ResponseEntity.ok(contaBancariaService.buscarIdContaBancaria(codigo));
    }

    @PostMapping(path = "/contabancaria")
    public ResponseEntity<ContaBancariaModel> cadastrarContaBancaria(@RequestBody ContaBancariaModel contaBancariaModel, ContaBancariaFactory contaBancariaFactory){
        ContaBancariaModel contaBancaria = contaBancariaService.cadastrarContaBancaria(contaBancariaModel, contaBancariaFactory);
        return new ResponseEntity<>(contaBancaria, HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/contabancaria/{codigo}")
    public void deletarContaBancaria(@PathVariable Long codigo){
        contaBancariaService.deletarContaBancaria(codigo);
    }
}

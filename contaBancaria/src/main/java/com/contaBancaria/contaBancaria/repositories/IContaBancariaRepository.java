package com.contaBancaria.contaBancaria.repositories;

import com.contaBancaria.contaBancaria.models.ContaBancariaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContaBancariaRepository extends JpaRepository <ContaBancariaModel, Long> {
}

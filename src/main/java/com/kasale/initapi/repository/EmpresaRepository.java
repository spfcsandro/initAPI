package com.kasale.initapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kasale.initapi.entity.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

	Empresa findByCnpj (String cnpj);
}

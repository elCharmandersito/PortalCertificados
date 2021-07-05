package com.certificados.repository;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;

import com.certificados.model.Certificados;

public interface CertificadoRepository extends JpaRepository<Certificados, Integer> {
	
	Certificados findById(int id) throws DataAccessException;

}

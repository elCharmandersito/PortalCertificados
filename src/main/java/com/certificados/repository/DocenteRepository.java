package com.certificados.repository;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;

import com.certificados.model.Docente;

public interface DocenteRepository extends JpaRepository<Docente, Integer>{
	
	List<Docente> findByNombre(String nombre) throws DataAccessException;

}

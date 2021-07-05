package com.certificados.repository;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;

import com.certificados.model.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer>{
	
	List<Estudiante> findByNombre(String nombre) throws DataAccessException;

}

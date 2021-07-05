package com.certificados.service;

import java.util.List;

import com.certificados.model.Estudiante;

public interface EstudianteService {
	
	void save(Estudiante estudiante) throws Exception;
	
	public List<Estudiante> getAllEstudiantes();

}

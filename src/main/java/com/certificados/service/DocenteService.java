package com.certificados.service;

import java.util.List;

import com.certificados.model.Docente;

public interface DocenteService {
	
	void save(Docente docente) throws Exception;
	
	public List<Docente> getAllDocentes();
}
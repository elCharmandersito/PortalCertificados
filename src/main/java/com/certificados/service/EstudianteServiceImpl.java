package com.certificados.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.certificados.model.Estudiante;
import com.certificados.repository.EstudianteRepository;

@Service
public class EstudianteServiceImpl implements EstudianteService{

	@Autowired
	private EstudianteRepository repo;

	@Override
	public List<Estudiante> getAllEstudiantes() {		
		return repo.findAll();
	}
	
	@Transactional
	@Override
	public void save(Estudiante estudiante) throws Exception {
		if(estudiante == null) {
			throw new Exception();
		}
		try {
			repo.save(estudiante);
		}catch(DataAccessException e) {
			e.printStackTrace();
			throw new Exception();
		}		
	}	
}
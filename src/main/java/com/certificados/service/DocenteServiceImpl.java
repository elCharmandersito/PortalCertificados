package com.certificados.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.certificados.model.Docente;
import com.certificados.repository.DocenteRepositoryImpl;

@Service
public class DocenteServiceImpl implements DocenteService{

	@Autowired
	private DocenteRepositoryImpl repo;
	
	@Transactional
	@Override
	public void save(Docente docente) throws Exception {
		if(docente == null) {
			throw new Exception();
		}
		try {
			repo.save(docente);
		}catch(DataAccessException e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	@Override
	public List<Docente> getAllDocentes() {		
		return repo.findAll();
	}
}
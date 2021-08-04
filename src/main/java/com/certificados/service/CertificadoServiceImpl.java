package com.certificados.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.certificados.model.Certificados;
import com.certificados.repository.CertificadoRepositoryImpl;

@Service
public class CertificadoServiceImpl implements CertificadoService {
	
	@Autowired
	private CertificadoRepositoryImpl repo;

	@Override
	public List<Certificados> getAllCertificados() {
		return repo.findAll();
	}	
	
	public Certificados findByInt(int id) {
		return repo.findById(id);
	}

	@Transactional
	@Override
	public void save(Certificados certificado) throws Exception {
		if(certificado == null) {
			throw new Exception();
		}
		try {
			repo.save(certificado);
		} catch(DataAccessException e) {
			e.printStackTrace();
			throw new Exception();
		}		
	}
}
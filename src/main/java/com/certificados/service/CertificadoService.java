package com.certificados.service;

import java.util.List;

import com.certificados.model.Certificados;

public interface CertificadoService {
	
	public List<Certificados> getAllCertificados();
	
	void save(Certificados certificado) throws Exception;

}

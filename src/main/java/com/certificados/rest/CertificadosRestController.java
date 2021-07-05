package com.certificados.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.certificados.model.Certificados;
import com.certificados.service.CertificadoServiceImpl;

@RequestMapping(value="/certificados")
@RestController
public class CertificadosRestController {
	
	@Autowired
	private CertificadoServiceImpl certificadoService;
	
	@PostMapping(value = "/agregar", produces = "application/json")
	public ResponseEntity<Certificados> addProducto(@RequestBody Certificados certificado) {
		try {
			certificadoService.save(certificado);
			return new ResponseEntity<Certificados>(certificado,HttpStatus.CREATED);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return new ResponseEntity<Certificados>(HttpStatus.BAD_REQUEST);
		}
	}	
	
	@GetMapping(value= "", produces = "application/json")
	public ResponseEntity<List<Certificados>> getAllProductos() {
		List<Certificados> certificados = certificadoService.getAllCertificados();
		if (!certificados.isEmpty()) {
			return new ResponseEntity<List<Certificados>>(certificados, HttpStatus.OK);
		}
		return new ResponseEntity<List<Certificados>>(HttpStatus.NOT_FOUND);
	}
}
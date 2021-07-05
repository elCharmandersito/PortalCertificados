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

import com.certificados.model.Docente;
import com.certificados.service.DocenteServiceImpl;

@RequestMapping(value="/docentes")
@RestController
public class DocenteRestController {
	
	@Autowired
	private DocenteServiceImpl docenteService;
	
	@PostMapping(value = "/agregar", produces = "application/json")
	public ResponseEntity<Docente> addDocente(@RequestBody Docente docente){
		try {
			docenteService.save(docente);
			return new ResponseEntity<Docente>(docente, HttpStatus.CREATED);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return new ResponseEntity<Docente>(HttpStatus.BAD_REQUEST);
		}		
	}
	
	@GetMapping(value = "", produces = "application/json")
	public ResponseEntity<List<Docente>> getAllDocentes(){
		List<Docente> docentes = docenteService.getAllDocentes();
		
		if(!docentes.isEmpty()) {
			return new ResponseEntity<List <Docente>>(docentes, HttpStatus.OK);
		}
		return new ResponseEntity<List<Docente>>(HttpStatus.NOT_FOUND);
	}
}
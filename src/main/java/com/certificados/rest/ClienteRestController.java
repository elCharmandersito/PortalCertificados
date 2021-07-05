package com.certificados.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.certificados.model.Estudiante;
import com.certificados.service.EstudianteServiceImpl;

@RestController
public class ClienteRestController {
	
	@Autowired
	private EstudianteServiceImpl estudianteService;
	
	@PostMapping(value = "/estudiantes/agregar", produces = "application/json")
	public ResponseEntity<Estudiante> addEstudiante(@RequestBody Estudiante estudiante){
		try {
			estudianteService.save(estudiante);
			return new ResponseEntity<Estudiante>(estudiante, HttpStatus.CREATED);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return new ResponseEntity<Estudiante>(HttpStatus.BAD_REQUEST);
		}		
	}
	
	@GetMapping(value = "/estudiante", produces = "application/json")
	public ResponseEntity<List<Estudiante>> getAllEstudiantes(){
		List<Estudiante> estudiantes = estudianteService.getAllEstudiantes();
		
		if(!estudiantes.isEmpty()) {
			return new ResponseEntity<List <Estudiante>>(estudiantes, HttpStatus.OK);
		}
		return new ResponseEntity<List<Estudiante>>(HttpStatus.NOT_FOUND);
	}
}

package com.certificados.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class certificados {
	
	@Id
	private int id;
	
	@Column(name = "tipoCertificado", length = 100)
	private String tipoCertificado;
	
	@Column(name = "motivo", length = 100)
	private String motivo;
	
	@Column(name = "rutAlumno", length = 10)
	private String rutAlumno;
	
	@Column(name = "rutDocente", length = 10)
	private String rutDocente;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "rutAlumno")
	@JsonBackReference
	private List<estudiante> estudiantes;
	

}

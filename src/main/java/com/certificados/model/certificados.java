package com.certificados.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "certificados")
public class Certificados {
	
	@Id
	private int id;
	
	@Column(name = "nombreCertificado", length = 100)
	private String nombreCertificado;
	
	@Column(name = "motivo", length = 100)
	private String motivo;	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonBackReference
	private Estudiante alumnoSolicitante;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonBackReference
	private Docente docenteHabilitador;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreCertificado() {
		return nombreCertificado;
	}

	public void setNombreCertificado(String nombreCertificado) {
		this.nombreCertificado = nombreCertificado;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public Estudiante getAlumnoSolicitante() {
		return alumnoSolicitante;
	}

	public void setAlumnoSolicitante(Estudiante alumnoSolicitante) {
		this.alumnoSolicitante = alumnoSolicitante;
	}

	public Docente getDocenteHabilitador() {
		return docenteHabilitador;
	}

	public void setDocenteHabilitador(Docente docenteHabilitador) {
		this.docenteHabilitador = docenteHabilitador;
	}
}
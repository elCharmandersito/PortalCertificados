package com.certificados.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Certificados {
	
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
	private Estudiante alumnoSolicitante;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "rutDocente")
	@JsonBackReference
	private Docente docenteHabilitador;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipoCertificado() {
		return tipoCertificado;
	}

	public void setTipoCertificado(String tipoCertificado) {
		this.tipoCertificado = tipoCertificado;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getRutAlumno() {
		return rutAlumno;
	}

	public void setRutAlumno(String rutAlumno) {
		this.rutAlumno = rutAlumno;
	}

	public String getRutDocente() {
		return rutDocente;
	}

	public void setRutDocente(String rutDocente) {
		this.rutDocente = rutDocente;
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
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
	private estudiante alumnoSolicitante;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "rutDocente")
	@JsonBackReference
	private docente docenteHabilitador;

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

	public estudiante getAlumnoSolicitante() {
		return alumnoSolicitante;
	}

	public void setAlumnoSolicitante(estudiante alumnoSolicitante) {
		this.alumnoSolicitante = alumnoSolicitante;
	}

	public docente getDocenteHabilitador() {
		return docenteHabilitador;
	}

	public void setDocenteHabilitador(docente docenteHabilitador) {
		this.docenteHabilitador = docenteHabilitador;
	}
}
package com.certificados.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class docente {
	
	@Id
	private String rut;
	
	@Column(name = "cargo", length = 100)
	private String cargo;
	
	@Column(name = "nombre", length = 50)
	private String nombre;
	
	@Column(name = "apellidoPaterno", length = 50)
	private String apellidoPaterno;
	
	@Column(name = "apellidoMaterno", length = 50)
	private String apellidoMaterno;
	
	@Column(name = "direccion", length = 50)
	private String direccion;
	
	@Column(name = "email", length = 100)
	private String email;
	
	@Column(name = "fono")
	private int fono;
	
	@OneToMany(mappedBy = "docente")
	private List<certificados> certificadosSolicitados;

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getFono() {
		return fono;
	}

	public void setFono(int fono) {
		this.fono = fono;
	}

	public List<certificados> getCertificadosSolicitados() {
		return certificadosSolicitados;
	}

	public void setCertificadosSolicitados(List<certificados> certificadosSolicitados) {
		this.certificadosSolicitados = certificadosSolicitados;
	}	
}
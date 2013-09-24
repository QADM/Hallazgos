package com.main.target;

// Generated 24/09/2013 10:26:46 AM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * Hallazgo generated by hbm2java
 */
public class Hallazgo implements java.io.Serializable {

	private String idHallazgo;
	private String idDependencia;
	private String tipo;
	private String periodo;
	private String descripcion;
	private String status;
	private Set caracteristicas = new HashSet(0);

	public Hallazgo() {
	}

	public Hallazgo(String idHallazgo, String idDependencia, String tipo,
			String periodo, String descripcion, String status) {
		this.idHallazgo = idHallazgo;
		this.idDependencia = idDependencia;
		this.tipo = tipo;
		this.periodo = periodo;
		this.descripcion = descripcion;
		this.status = status;
	}

	public Hallazgo(String idHallazgo, String idDependencia, String tipo,
			String periodo, String descripcion, String status,
			Set caracteristicas) {
		this.idHallazgo = idHallazgo;
		this.idDependencia = idDependencia;
		this.tipo = tipo;
		this.periodo = periodo;
		this.descripcion = descripcion;
		this.status = status;
		this.caracteristicas = caracteristicas;
	}

	public String getIdHallazgo() {
		return this.idHallazgo;
	}

	public void setIdHallazgo(String idHallazgo) {
		this.idHallazgo = idHallazgo;
	}

	public String getIdDependencia() {
		return this.idDependencia;
	}

	public void setIdDependencia(String idDependencia) {
		this.idDependencia = idDependencia;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPeriodo() {
		return this.periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set getCaracteristicas() {
		return this.caracteristicas;
	}

	public void setCaracteristicas(Set caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

}
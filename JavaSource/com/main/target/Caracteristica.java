package com.main.target;

// Generated 24/09/2013 10:26:46 AM by Hibernate Tools 4.0.0

/**
 * Caracteristica generated by hbm2java
 */
public class Caracteristica implements java.io.Serializable {

	private CaracteristicaId id;
	private Hallazgo hallazgo;

	public Caracteristica() {
	}

	public Caracteristica(CaracteristicaId id, Hallazgo hallazgo) {
		this.id = id;
		this.hallazgo = hallazgo;
	}

	public CaracteristicaId getId() {
		return this.id;
	}

	public void setId(CaracteristicaId id) {
		this.id = id;
	}

	public Hallazgo getHallazgo() {
		return this.hallazgo;
	}

	public void setHallazgo(Hallazgo hallazgo) {
		this.hallazgo = hallazgo;
	}

}

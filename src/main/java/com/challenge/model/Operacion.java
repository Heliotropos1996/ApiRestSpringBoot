package com.challenge.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Operacion {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String validez;
	private Double importe;
	private Double tasa;
	String marca;
	
	@ManyToOne
	Tarjeta tarj;
	
	
	public Operacion() {
		
	}
	

	public Operacion(Integer id, Double importe, Double tasa, String marca ) {
		
		this.id = id;
		this.importe = importe;
		this.tasa = tasa;
		this.marca = marca;
	}





	public Double getImporte() {
		return importe;
	}


	public void setImporte(Double importe) {
		this.importe = importe;
	}


	public Double getTasa() {
		return tasa;
	}


	public void setTasa(Double tasa) {
		this.tasa = tasa;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getValidez() {
		return validez;
	}

	public void setValidez(String validez) {
		this.validez = validez;
	}

	public Tarjeta getTarj() {
		return tarj;
	}

	public void setTarj(Tarjeta tarj) {
		this.tarj = tarj;
	}
}
	

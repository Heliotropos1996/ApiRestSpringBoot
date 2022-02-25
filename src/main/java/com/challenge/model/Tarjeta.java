package com.challenge.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Tarjeta implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Integer numTarjeta;
	
	private String marca;
	
	private String cardholder;

	@DateTimeFormat(pattern = "MM-yy")
	private Date fech_venc;

	
	
	public Tarjeta() {
	
	}

	public Tarjeta(Long id, Integer numTarjeta, String marca, String cardholder, Date fech_venc) {
		
		this.id = id;
		this.numTarjeta = numTarjeta;
		this.marca = marca;
		this.cardholder = cardholder;
		this.fech_venc = fech_venc;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNumTarjeta() {
		return numTarjeta;
	}

	public void setNumTarjeta(Integer numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCardholder() {
		return cardholder;
	}

	public void setCardholder(String cardholder) {
		this.cardholder = cardholder;
	}

	public Date getFech_venc() {
		return fech_venc;
	}

	public void setFech_venc(Date fech_venc) {
		this.fech_venc = fech_venc;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

	
}

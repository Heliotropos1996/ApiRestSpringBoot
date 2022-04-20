package com.challenge.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.model.Tarjeta;
import com.challenge.repositorio.TarjetaRepositorio;

@Service
public class TarjetaServicio {
	
 TarjetaRepositorio tarjetaRepositorio;
 
 	@Autowired
	public TarjetaServicio (TarjetaRepositorio tarjetarepositorio) {
 		this.tarjetaRepositorio = tarjetarepositorio;
 	}
	public List<Tarjeta> obtenerTarjeta (){
		
		return tarjetaRepositorio.findAll();
	}
	public void crearTarjeta(Tarjeta tarj) {
		tarjetaRepositorio.save(tarj);
		
	}
	
	public Tarjeta obtenerPorId (Long id) {
		
		Optional<Tarjeta> opTarj = tarjetaRepositorio.findById(id);
		
		Tarjeta tarj = opTarj.get();
		
		return tarj; 
	
	}
}

package com.challenge.servicios;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.model.Operacion;
import com.challenge.repositorio.OperacionRepositorio;

@Service
public class OperacionServicio {
	OperacionRepositorio operacionRepositorio;
	 
 	@Autowired
	public OperacionServicio (OperacionRepositorio operacionrepositorio) {
 		this.operacionRepositorio = operacionrepositorio;
 	}
 	public Operacion obtenerOperacion (Integer id) throws Exception{
		
 		 Optional<Operacion>  ope = operacionRepositorio.findById(id);
 		
 		if (!ope.isPresent()) {
 		  
 		   throw new Exception("No se encontró la operación.");
 		}

 		Operacion opera = ope.get();
 		Integer ide = opera.getId();
 		String marca = opera.getTarj().getMarca();
 		Double tasa = opera.getTasa();
 		Double importe = opera.getImporte();
 		
 		Operacion oper = new Operacion(ide, importe, tasa, marca);
 		
		return oper;
}
}

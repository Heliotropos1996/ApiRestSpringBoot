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
 		opera.getTarj().getMarca();
 	
 		
		
 		
		Operacion oper = new Operacion();
		return oper;
}
}

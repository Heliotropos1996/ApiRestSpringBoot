package com.challenge.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.model.Operacion;
import com.challenge.servicios.OperacionServicio;


@RestController
@RequestMapping("/operacion")
public class OperacionControlador {
	OperacionServicio operacionServicio;
	@Autowired
	public OperacionControlador (OperacionServicio operacionServicio) {
		this.operacionServicio = operacionServicio;
	}
	
	@GetMapping(path = "/{id}")
	public Operacion obtenerOperacion(@PathVariable(name = "id", required = true)Integer id) throws Exception{
		
		return operacionServicio.obtenerOperacion(id);
	}
}

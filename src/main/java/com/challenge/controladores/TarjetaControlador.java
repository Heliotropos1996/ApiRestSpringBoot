package com.challenge.controladores;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.challenge.model.Tarjeta;
import com.challenge.servicios.TarjetaServicio;

@RestController
@RequestMapping("/tarjeta")
public class TarjetaControlador {
	
	TarjetaServicio tarjetaServicio;
	@Autowired
	public TarjetaControlador(TarjetaServicio tarjetaServicio) {
		this.tarjetaServicio = tarjetaServicio;
	}
	
	@GetMapping("/obtener")
	public List<Tarjeta> obtenerTarjeta(){
		
		return tarjetaServicio.obtenerTarjeta();
	}
	
	@PostMapping
	public void crearTarjeta(Tarjeta tarj) {
		
		
		tarjetaServicio.crearTarjeta(tarj);
		
	}
	@GetMapping("/{id}")
	public Tarjeta obtenerPorId (@PathVariable Long id) {
		
		return tarjetaServicio.obtenerPorId(id);
	}
	
	
}

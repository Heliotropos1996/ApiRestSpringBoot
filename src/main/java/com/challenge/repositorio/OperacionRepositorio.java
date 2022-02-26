package com.challenge.repositorio;


import org.springframework.data.jpa.repository.JpaRepository;


import com.challenge.model.Operacion;


public interface OperacionRepositorio extends JpaRepository<Operacion, Integer> {
	  

	}


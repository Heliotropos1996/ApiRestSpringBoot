package com.challenge.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.challenge.model.Tarjeta;

public interface TarjetaRepositorio extends JpaRepository<Tarjeta, Long> {

}

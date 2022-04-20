package com.challenge.repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.challenge.model.Tarjeta;

@Repository
public interface TarjetaRepositorio extends JpaRepository<Tarjeta, Long> {

}

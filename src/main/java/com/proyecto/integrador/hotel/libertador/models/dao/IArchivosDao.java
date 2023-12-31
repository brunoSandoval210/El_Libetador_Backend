package com.proyecto.integrador.hotel.libertador.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.integrador.hotel.libertador.models.entity.Archivos;

public interface IArchivosDao extends JpaRepository<Archivos, Long>{
	Archivos findByNombre(String nombre);
}

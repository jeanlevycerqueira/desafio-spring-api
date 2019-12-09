package com.empresa.desafiospring.api.service;

import java.util.Optional;

import com.empresa.desafiospring.api.model.Cargo;



public interface ICargoService {

	public Cargo save(Cargo cargo);
	
	public Optional<Cargo> findById(Long id);
}

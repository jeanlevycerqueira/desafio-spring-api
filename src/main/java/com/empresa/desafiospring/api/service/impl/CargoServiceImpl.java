package com.empresa.desafiospring.api.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.desafiospring.api.model.Cargo;
import com.empresa.desafiospring.api.repository.ICargoRepository;
import com.empresa.desafiospring.api.service.ICargoService;

@Service
public class CargoServiceImpl implements ICargoService{
	
	private static final Logger log = LoggerFactory.getLogger(CargoServiceImpl.class);
	
	@Autowired
	private ICargoRepository cargoRepository;

	@Override
	public Cargo save(Cargo cargo) {
		log.info("Cadastrando Cargo: {}", cargo);
		return this.cargoRepository.save(cargo);
	}

	@Override
	public Optional<Cargo> findById(Long id) {
		return this.cargoRepository.findById(id);
	}


}

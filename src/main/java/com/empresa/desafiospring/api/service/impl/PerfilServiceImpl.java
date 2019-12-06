package com.empresa.desafiospring.api.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.desafiospring.api.model.Perfil;
import com.empresa.desafiospring.api.repository.IPerfilRepository;
import com.empresa.desafiospring.api.service.IPerfilService;

@Service
public class PerfilServiceImpl implements IPerfilService{
	
	private static final Logger log = LoggerFactory.getLogger(PerfilServiceImpl.class);
	
	@Autowired
	private IPerfilRepository perfilRepository;

	@Override
	public Perfil save(Perfil perfil) {
		log.info("Cadastrando Perfil: {}", perfil);
		return this.perfilRepository.save(perfil);
	}

	@Override
	public Optional<Perfil> findById(Long id) {
		return this.perfilRepository.findById(id);
	}

}

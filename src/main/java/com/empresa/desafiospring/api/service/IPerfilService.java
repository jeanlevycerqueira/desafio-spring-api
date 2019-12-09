package com.empresa.desafiospring.api.service;

import java.util.Optional;

import com.empresa.desafiospring.api.model.Perfil;


public interface IPerfilService {

	public Perfil save(Perfil perfil);
	
	public Optional<Perfil> findById(Long id);
	
	
}

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
	private IPerfilRepository profileRepository;

//	@Override
//	public Perfil persist(Perfil perfil) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Optional<Perfil> findById(Long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public Profile persist(Profile profile) {
//		log.info("Persisting Profile: {}", profile);
//		return this.profileRepository.save(profile);
//	}
//
//	@Override
//	public Optional<Profile> findById(Long id) {
//		return this.profileRepository.findById(id);
//	}

}

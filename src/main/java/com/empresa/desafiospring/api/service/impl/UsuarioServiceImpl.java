package com.empresa.desafiospring.api.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.desafiospring.api.enums.TipoStatus;
import com.empresa.desafiospring.api.model.Cargo;
import com.empresa.desafiospring.api.model.Perfil;
import com.empresa.desafiospring.api.model.Usuario;
import com.empresa.desafiospring.api.repository.IUsuarioRepository;
import com.empresa.desafiospring.api.service.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService{
	
	private static final Logger log = LoggerFactory.getLogger(UsuarioServiceImpl.class);
	
	@Autowired
	private IUsuarioRepository usuarioRepository;
		
	@Override
	public Usuario save(Usuario usuario) {
		log.info("Cadastrando Usuario: {}", usuario);
		return this.usuarioRepository.save(usuario);
	}

	
	@Override
	public void inativar(TipoStatus tipoStatus, Long id) {
		this.usuarioRepository.inativar(tipoStatus, id);
	} 

	@Override
	public void delete(Long id) {
		this.usuarioRepository.deleteById(id);
	}

	@Override
	public List<Usuario> listAll() {
		return this.usuarioRepository.findAll();
	}

	@Override
	public List<Usuario> findByPerfil(Long id) {
		return this.usuarioRepository.findByPerfil(id);
	}

		@Override
	public List<Usuario> findByCargo(Long id) {
		return this.usuarioRepository.findByCargo(id);
	}

	@Override
	public Optional<Usuario> findByNome(String nome) {
		return this.usuarioRepository.findByNome(nome);
	}

	@Override
	public Optional<Usuario> findByCpf(String cpf) {
		return this.usuarioRepository.findByCpf(cpf);
	}

	@Override
	public List<Usuario> findByPerfil(Perfil perfil) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> findByCargo(Cargo cargo) {
		// TODO Auto-generated method stub
		return null;
	}



}

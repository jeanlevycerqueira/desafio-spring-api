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
	
//public Usuario save(Usuario user);
//	
//	public void delete(Long id);
//	
//	public List<Usuario> listAll();
//	
//	List<Usuario> findByPerfilId(@Param("idPerfil") Long findByPerfilId);
//	
//	List<Usuario> findByCargoId(@Param("id") Long id);
//	
//	public Optional<Usuario> findByNome(String nome);
//	
//	public Optional<Usuario> findByCpf(String cpf);
//
//	public void inativar(TipoSexo tipoSexo, Long id);
	
	@Override
	public Usuario save(Usuario usuario) {
		log.info("Cadastrando Usuario: {}", usuario);
		return this.usuarioRepository.save(usuario);
	}
//TODO:IMPLEMENTAR O METODO NA CLASSE GENERICA.
	/*
	 * @Override public void inativar(♦ id) {
	 * log.info("Desabilitando CODIGO: {}", id);
	 * this.usuarioRepository.inativar(id); }
	 */

	@Override
	public void delete(Long id) {
		log.info("Removing UserId: {}", id);
		this.usuarioRepository.deleteById(id);
	}

	@Override
	public List<Usuario> listAll() {
		return null; //this.usuarioRepository.listAll();
	}

	@Override
	public List<Usuario> findByPerfil(Perfil perfil) {
		return this.usuarioRepository.findByPerfil(perfil);
	}

	

	@Override
	public List<Usuario> findByCargo(Cargo cargo) {
		return this.usuarioRepository.findByCargo(cargo);
	}

	@Override
	public Optional<Usuario> findByNome(String nome) {
		return this.usuarioRepository.findByNome(nome);
	}

	@Override
	public Optional<Usuario> findByCpf(String cpf) {
		return this.usuarioRepository.findByCpf(cpf);
	}



}

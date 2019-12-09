package com.empresa.desafiospring.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.query.Param;

import com.empresa.desafiospring.api.enums.TipoStatus;
import com.empresa.desafiospring.api.model.Cargo;
import com.empresa.desafiospring.api.model.Perfil;
import com.empresa.desafiospring.api.model.Usuario;


public interface IUsuarioService {

	public Usuario save(Usuario user);
	
	public void delete(Long id);
	
	public List<Usuario> listAll();
	
	public List<Usuario> findByPerfil(@Param("perfil") Perfil perfil);
	
	public List<Usuario> findByCargo(@Param("cargo") Cargo cargo);
	
	public Optional<Usuario> findByNome(String nome);
	
	public Optional<Usuario> findByCpf(String cpf);

	public List<Usuario> findByPerfil(Long id);

	public List<Usuario> findByCargo(Long id);
	
	public void inativar(TipoStatus tipoStatus, Long id);

	
	
}

package com.empresa.desafiospring.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.query.Param;
import com.empresa.desafiospring.api.model.Cargo;
import com.empresa.desafiospring.api.model.Perfil;
import com.empresa.desafiospring.api.model.Usuario;


public interface IUsuarioService {

	public Usuario save(Usuario user);
	
	public void delete(Long id);
	
	public List<Usuario> listAll();
	
	List<Usuario> findByPerfil(@Param("perfil") Perfil perfil);
	
	List<Usuario> findByCargo(@Param("cargo") Cargo cargo);
	
	public Optional<Usuario> findByNome(String nome);
	
	public Optional<Usuario> findByCpf(String cpf);

	//public void ivativar(TipoStatus tipoStatus, Long id);


	
	
}

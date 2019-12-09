package com.empresa.desafiospring.api.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.empresa.desafiospring.api.enums.TipoSexo;
import com.empresa.desafiospring.api.model.Cargo;
import com.empresa.desafiospring.api.model.Perfil;
import com.empresa.desafiospring.api.model.Usuario;

@Transactional(readOnly = true)
@NamedQueries({
	@NamedQuery(name = "IUsuarioRepository.findByPerfil", 
			query = "SELECT usuario FROM Usuario usuario WHERE user.perfil = :perfil"),
	@NamedQuery(name = "IUsuarioRepository.findByCargo", 
	query = "SELECT usuario FROM Usuario usuario WHERE usuario.cargo = :cargo")
	
})

public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {
	
	List<Usuario> findByPerfil(@Param("perfil") Perfil findByPerfil);
	
	List<Usuario> findByCargo(@Param("cargo") Cargo cargo);
	
	public Optional<Usuario> findByNome(String nome);
	
	public Optional<Usuario> findByCpf(String cpf);
	
	public Optional<Usuario> findBySexo(TipoSexo tipoSexo);
	
	
	
}

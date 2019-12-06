package com.empresa.desafiospring.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.empresa.desafiospring.api.model.Perfil;

@Transactional(readOnly = true)
public interface IPerfilRepository extends JpaRepository<Perfil, Long> {
	

}

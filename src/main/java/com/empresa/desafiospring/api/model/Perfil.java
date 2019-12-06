package com.empresa.desafiospring.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "perfis")
public class Perfil implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -16478933476804026L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id_perfil")
	private Long idPerfil;
	
	@Column(name = "nome_perfil", nullable = false, length = 100)
	private String nome;
	
	@Column(name = "desc_perfil", nullable = false, length = 255)
	private String desc;
	
	public Perfil() {
	}
	

	public Perfil(Long idPerfil, String nome, String desc) {
		super();
		this.idPerfil = idPerfil;
		this.nome = nome;
		this.desc = desc;
	}


	public Long getIdPerfil() {
		return idPerfil;
	}

	public void setIdPerfil(Long idPerfil) {
		this.idPerfil = idPerfil;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}

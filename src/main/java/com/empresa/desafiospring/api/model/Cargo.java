package com.empresa.desafiospring.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cargos")
public class Cargo implements Serializable{

	private static final long serialVersionUID = -2286770971354216272L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id_cargo")
	private Long id;
	
	@Column(name = "nome_cargo", nullable = false,length = 100)
	private String nome;
	
	@Column(name = "desc_cargo", nullable = false, length = 255)
	private String desc;
	
	public Cargo() {
	}
	
	public Cargo(Long id, String nome, String desc) {
		super();
		this.id = id;
		this.nome = nome;
		this.desc = desc;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

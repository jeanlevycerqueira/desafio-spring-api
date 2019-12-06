package com.empresa.desafiospring.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "cargos")
public class Cargo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2286770971354216272L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "cargo_id")
	private Long id;
	
	@Column(name = "nome_cargo", nullable = false,length = 100)
	private String nome;
	
	@Column(name = "desc_cargo", nullable = false, length = 255)
	private String desc;


}

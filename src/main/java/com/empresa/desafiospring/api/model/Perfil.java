package com.empresa.desafiospring.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.empresa.desafiospring.api.util.Codded;

import lombok.*;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "perfis")
public class Perfil implements Codded{

	
	private static final long serialVersionUID = -16478933476804026L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id_perfil")
	private Long id;
	
	@Column(name = "nome_perfil", nullable = false, length = 100)
	private String nome;
	
	@Column(name = "desc_perfil", nullable = false, length = 255)
	private String desc;

	
	

	
}

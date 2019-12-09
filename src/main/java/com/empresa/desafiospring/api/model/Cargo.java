package com.empresa.desafiospring.api.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.empresa.desafiospring.api.util.Codded;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Entity
@Table(name = "cargos")
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Cargo implements Codded {

	private static final long serialVersionUID = -2286770971354216272L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id_cargo")
	private Long id;
	@Column(name = "nome_cargo", nullable = false,length = 100)
	private String nome;
	@Column(name = "desc_cargo", nullable = false, length = 255)
	private String desc;
	
	
}

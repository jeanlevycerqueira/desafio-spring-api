package com.empresa.desafiospring.api.dto;


import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

import lombok.Data;
import lombok.ToString;


@Data
@ToString
public class UsuarioDTO {
	
	private Long id;
	
	@NotEmpty(message = "{validacao.in.cpf.not.empty}")
	@Length(min = 3, max = 200, message = "{validacao.in.nome.caracteres}")
	private String nome;
	
    @NotEmpty(message = "{validacao.in.cpf.not.empty}")
	@CPF(message= "{validacao.in.cpf.invalido}")
	private String cpf;
	    
	@NotEmpty(message = "{validacao.in.sexo.null}")
	private String sexo;
	
	@NotEmpty(message = "{validacao.in.data.nasc.null}")
	private String dataNasc;
	
	private Long idCargo;
	private Long idPerfil;
	private Integer status;
	

}

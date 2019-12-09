package com.empresa.desafiospring.api.dto;

import java.util.UUID;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CargoDTO {

	    private UUID uuid;	
		private Long codigo;

	    @NotNull(message = "{validacao.in.nome.not.null}")
	    @NotEmpty(message = "{validacao.in.nome.not.empty}")
	    private String nome;

	    @NotNull(message = "{validacao.in.desc.not.null}")
	    @NotEmpty(message = "{validacao.in.desc.not.empty}")
	    private String desc;

	
}

package com.empresa.desafiospring.api.dto;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@ToString
public class CargoDTO {

			
		private Long codigo;

	    @NotNull(message = "{validacao.in.nome.not.null}")
	    @NotEmpty(message = "{validacao.in.nome.not.empty}")
	    private String nome;

	    @NotNull(message = "{validacao.in.desc.not.null}")
	    @NotEmpty(message = "{validacao.in.desc.not.empty}")
	    private String desc;

	
}

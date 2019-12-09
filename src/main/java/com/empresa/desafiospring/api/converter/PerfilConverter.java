package com.empresa.desafiospring.api.converter;

import java.util.function.Function;

import org.springframework.stereotype.Component;

import com.empresa.desafiospring.api.dto.PerfilDTO;
import com.empresa.desafiospring.api.model.Perfil;

@Component
public class PerfilConverter  implements Function<PerfilDTO, Perfil>{

	@Override
	public Perfil apply(PerfilDTO t) {
		Perfil perfil = new Perfil();
		perfil.setNome(t.getNome());
		perfil.setDesc(t.getDesc());
		
		return perfil;
	}

	

	

	
	
	
}

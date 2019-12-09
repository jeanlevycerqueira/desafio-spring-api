package com.empresa.desafiospring.api.converter;

import java.time.LocalDate;
import java.util.function.Function;
import org.springframework.stereotype.Component;
import com.empresa.desafiospring.api.dto.UsuarioDTO;
import com.empresa.desafiospring.api.enums.TipoSexo;
import com.empresa.desafiospring.api.enums.TipoStatus;
import com.empresa.desafiospring.api.model.Usuario;

@Component
public class UsuarioConverter  implements Function<UsuarioDTO, Usuario>{

	@Override
	public Usuario apply(UsuarioDTO t) {
		Usuario usuario = new Usuario();
		
		usuario.setId(t.getId());
	   	usuario.setNome(t.getNome());
		usuario.setCpf(t.getCpf());
		if(t.getSexo() == "M") {
			usuario.setSexo(TipoSexo.MASCULINO);
		} else {
			usuario.setSexo(TipoSexo.FEMININO);
		}
		if(t.getStatus() == 0) {
			usuario.setStatus(TipoStatus.INATIVO);
		} else {
			usuario.setStatus(TipoStatus.ATIVO);
		}
		usuario.setDataNascimento(LocalDate.parse(t.getDataNasc()));
		return usuario;	
	
	}

	

	
	
	
}

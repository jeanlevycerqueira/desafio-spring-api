package com.empresa.desafiospring.api.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.desafiospring.api.converter.UsuarioConverter;
import com.empresa.desafiospring.api.dto.UsuarioDTO;
import com.empresa.desafiospring.api.enums.TipoStatus;
import com.empresa.desafiospring.api.model.Cargo;
import com.empresa.desafiospring.api.model.Perfil;
import com.empresa.desafiospring.api.model.Usuario;
import com.empresa.desafiospring.api.response.Response;
import com.empresa.desafiospring.api.service.ICargoService;
import com.empresa.desafiospring.api.service.IPerfilService;
import com.empresa.desafiospring.api.service.IUsuarioService;


@RestController
@CrossOrigin(origins = "*")
@SuppressWarnings("unchecked")
public class UsuarioController extends ApiController{
	
	private static final Logger log = LoggerFactory.getLogger(UsuarioController.class);
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@Autowired
	private ICargoService cargoService;
	
	@Autowired
	private IPerfilService perfilService;
	
	@Autowired
	private UsuarioConverter usuarioConverter;
	
	
	
	@GetMapping(path = "/api/usuario/{idUsuario}")
    public ResponseEntity<UsuarioDTO> findById(@RequestParam(value="idUsuario") Long cod) {
 
        return ok(perfilService.findById(cod), usuarioConverter);

    }
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<UsuarioDTO> save(@RequestBody @Valid UsuarioDTO usuarioDTO,
			BindingResult result) {
				
		Usuario usuario = usuarioConverter.apply(usuarioDTO);
		
		return created(usuarioService.save(this.preencheDependencias(usuario)), usuarioConverter);  

    }
	
	
	@GetMapping(value = "/api/usuario/")
	public ResponseEntity<Response<String>> getAll() {
		List<Usuario> usuario = usuarioService.listAll();

		return ok(usuario, usuarioConverter);
	}

	
	@GetMapping(value = "/api/usuario/perfil/{idPerfil}")
	public ResponseEntity<Response<String>> findByPerfilId(@PathVariable("idPerfil") Long idPerfil) {
		return ok(this.usuarioService.findByPerfil(idPerfil), usuarioConverter);
	}
	
	@GetMapping(value = "/api/usuario/cargo/{idCargo}")
	public ResponseEntity<Response<String>> findByCargo(@PathVariable("idCargo") Long idCargo) {
		return ok(this.usuarioService.findByCargo(idCargo), usuarioConverter);
	}
	
	
	@GetMapping(value = "/api/usuario/{id}")
	public ResponseEntity<Response<String>> inativar(@PathVariable("id") Long id) {

			this.usuarioService.inativar(TipoStatus.INATIVO, id);
		
		
		return noContent();
	}

	
	@GetMapping(value = "/api/usuario/cpf{cpf}")
	public ResponseEntity<UsuarioDTO> findByCpf(@PathVariable("cpf") String cpf) {
		return ok(this.usuarioService.findByCpf(cpf), usuarioConverter);
	}
	
	
	
	@DeleteMapping(value = "/api/user/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Long id) {

		this.usuarioService.delete(id);

		return noContent();
	}
	
	
	private Usuario preencheDependencias(Usuario usuario) {
		
		
		Optional<Cargo> cargo = cargoService.findById(usuario.getId());
		Optional<Perfil> perfil = this.perfilService.findById(usuario.getId());
		
		usuario.setPerfil(perfil.get());
		usuario.setCargo(cargo.get());

		return usuario;
		
	}

	

}

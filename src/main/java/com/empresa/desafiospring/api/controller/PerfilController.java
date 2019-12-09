package com.empresa.desafiospring.api.controller;


import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.desafiospring.api.converter.PerfilConverter;
import com.empresa.desafiospring.api.dto.PerfilDTO;
import com.empresa.desafiospring.api.model.Perfil;
import com.empresa.desafiospring.api.service.IPerfilService;

@RestController
@CrossOrigin(origins = "*")
@SuppressWarnings("unchecked")
public class PerfilController extends ApiController{
	
	private static final Logger log = LoggerFactory.getLogger(PerfilController.class);
	
	@Autowired
	private IPerfilService perfilService;
	@Autowired
	private PerfilConverter perfilConverter;
	
	
	@GetMapping(path = "/search")
    public ResponseEntity<Perfil> findById(@RequestParam(value="codigo") Long cod) {
 
        return ok(perfilService.findById(cod), perfilConverter);

    }
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<PerfilDTO> save(@RequestBody @Valid PerfilDTO perfilDTO,
			BindingResult result) {

        return created(perfilService.save(perfilConverter.apply(perfilDTO)), perfilConverter);  

    }
	

}

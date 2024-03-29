package com.empresa.desafiospring.api.controller;

import java.security.NoSuchAlgorithmException;

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

import com.empresa.desafiospring.api.converter.CargoConverter;

import com.empresa.desafiospring.api.dto.CargoDTO;
import com.empresa.desafiospring.api.model.Cargo;
import com.empresa.desafiospring.api.response.Response;
import com.empresa.desafiospring.api.service.ICargoService;
import com.github.dozermapper.core.DozerConverter;

@RestController
@CrossOrigin(origins = "*")
@SuppressWarnings("unchecked")
public class CargoController extends ApiController{
	
	private static final Logger log = LoggerFactory.getLogger(CargoController.class);
	
	@Autowired
	private ICargoService cargoService;
	@Autowired
	private CargoConverter cargoConverter;
	
	Cargo cargo = new Cargo();
	
	
	@GetMapping(path = "/search")
    public ResponseEntity<Cargo> findById(@RequestParam(value="codigo") Long cod) {
 
        return ok(cargoService.findById(cod), cargoConverter);

    }
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<CargoDTO> save(@RequestBody @Valid CargoDTO cargoDTO,
			BindingResult result) {

        return created(cargoService.save(cargoConverter.apply(cargoDTO)), cargoConverter);  

    }

	
	
	
	

}

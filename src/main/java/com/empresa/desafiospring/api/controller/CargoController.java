package com.empresa.desafiospring.api.controller;

import java.security.NoSuchAlgorithmException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.desafiospring.api.dto.CargoDTO;
import com.empresa.desafiospring.api.model.Cargo;
import com.empresa.desafiospring.api.response.Response;
import com.empresa.desafiospring.api.service.ICargoService;
import com.github.dozermapper.core.DozerConverter;


@RestController
@CrossOrigin(origins = "*")
public class CargoController {
	
	private static final Logger log = LoggerFactory.getLogger(CargoController.class);
	
	@Autowired
	private ICargoService cargoService;
	

	@PostMapping("api/office")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Response<CargoDTO>> cadastrar(@RequestBody CargoDTO cargoDTO,
			BindingResult result) throws NoSuchAlgorithmException {
		
		
		Response<CargoDTO> response = new Response<CargoDTO>();
		
		Cargo cargo = DozerConverter.parseObject(cargoDTO, Cargo.class);
		Cargo cargoPost = this.cargoService.save(cargo);
		OfficeVO officeVOConverted = DozerConverter.parseObject(officePersisted, OfficeVO.class);

		response.setData(officeVOConverted);
		return ResponseEntity.ok(response);
		 
	 }
	

}

package com.empresa.desafiospring.api.converter;

import java.util.function.Function;

import org.springframework.stereotype.Component;

import com.empresa.desafiospring.api.dto.CargoDTO;
import com.empresa.desafiospring.api.model.Cargo;

@Component
public class CargoConverter  implements Function<CargoDTO, Cargo>{

	@Override
	public Cargo apply(CargoDTO t) {
		Cargo cargo = new Cargo();
		cargo.setNome(t.getNome());
		cargo.setDesc(t.getDesc());
		
		return cargo;
	}

	

	

	
	
	
}

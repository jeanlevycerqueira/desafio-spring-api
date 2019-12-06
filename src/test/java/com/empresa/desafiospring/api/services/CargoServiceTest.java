package com.empresa.desafiospring.api.services;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.empresa.desafiospring.api.model.Cargo;
import com.empresa.desafiospring.api.service.ICargoService;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class CargoServiceTest {

	private static final Logger log = LoggerFactory.getLogger(CargoServiceTest.class);
	
	@Autowired
	private ICargoService cargoService;

	
	  @Test public void testPersist() {
	  
	  Cargo cargo = new Cargo();
	  
	  cargo.setNome("Analista Fiscal"); 
	  cargo.setDesc("Analista Fiscal da Cia");
	  
	  Cargo cargoPersisted = this.cargoService.save(cargo);
	  
	  assertNotNull(cargoPersisted); 
	  
	  }
	 

	@Test
	public void testSelect() {
		Cargo cargo = this.cargoService.findById(1l).orElse(new Cargo());

		log.info("Cargo: "+cargo.getNome());
		log.info("Descriçao: "+cargo.getDesc());

	}

}

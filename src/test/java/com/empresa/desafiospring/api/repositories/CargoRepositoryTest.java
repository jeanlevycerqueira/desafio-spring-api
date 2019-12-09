package com.empresa.desafiospring.api.repositories;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.empresa.desafiospring.api.model.Cargo;
import com.empresa.desafiospring.api.repository.ICargoRepository;



@RunWith(SpringRunner.class)
@ActiveProfiles("test")
@SpringBootTest
public class CargoRepositoryTest {
	
	@Autowired
	private ICargoRepository cargoRepository;
	
	@Before
	public void setUp() throws Exception {
		Cargo cargo = new Cargo();
		cargo.setNome("Vendedor");
		cargo.setDesc("Vendedor da compania");
		
		this.cargoRepository.save(cargo);
	}
	
	@After
    public final void tearDown() { 
//		this.cargoRepository.deleteAll();
	}

	
}

package com.empresa.desafiospring.api.services;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.empresa.desafiospring.api.model.Perfil;
import com.empresa.desafiospring.api.service.IPerfilService;


@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class PerfilServiceTest {
	
	@Autowired
	private IPerfilService perfilService;
	
	@Test
	public void testPersist() {
		
		Perfil perfil = new Perfil();
		
		perfil.setNome("Operador");
		perfil.setDesc("Operador do sistema");
		
		Perfil perfilPersisted = this.perfilService.save(perfil);
		
		assertNotNull(perfilPersisted);
	}
}

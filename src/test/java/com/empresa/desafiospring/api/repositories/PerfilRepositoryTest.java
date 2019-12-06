package com.empresa.desafiospring.api.repositories;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.empresa.desafiospring.api.model.Perfil;
import com.empresa.desafiospring.api.repository.IPerfilRepository;



@RunWith(SpringRunner.class)
@ActiveProfiles("test")
@SpringBootTest
public class PerfilRepositoryTest {
	
	@Autowired
	private IPerfilRepository perfilRepository;
	
	@Before
	public void setUp() throws Exception {
		Perfil perfil = new Perfil();
		perfil.setNome("Adm");
		perfil.setDesc("Administrador do Sistema");
		
		this.perfilRepository.save(perfil);
	}
	
	@After
    public final void tearDown() { 
//		this.perfilRepository.deleteAll();
	}

	
}

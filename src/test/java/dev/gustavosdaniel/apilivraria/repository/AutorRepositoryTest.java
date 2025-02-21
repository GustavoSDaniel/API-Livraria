package dev.gustavosdaniel.apilivraria.repository;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import dev.gustavosdaniel.apilivraria.model.Autor;

@SpringBootTest // SEMPRE QUE FOR UMA CLASSE DE TEST COLOCAR ESSA ANOTAÇÃO
public class AutorRepositoryTest {
	
	@Autowired //INTETANDO O AUTORREPOSITORY
	AutorRepository repository;
	
	@Test
	public void salvarTest() {
		
		Autor autor = new Autor(); // CRIANDO UM NOVO OBJETO
		autor.setNome("José");
		autor.setDataNascimento(LocalDate.of(1950, 10, 10));
		autor.setNacionalidade("Brasileiro");
		
		var autorSalvo = repository.save(autor);
		System.out.println("Autor salvo" + autorSalvo);
	}
	
	@Test
	public void atualizarTest() {
		
	}
	
	
	
}

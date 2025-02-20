package dev.gustavosdaniel.apilivraria.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "autor_db")
public class Autor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 100, nullable = false) // nullable fala que é um campo not nnull
	private String nome;
	
	@Column(length = 50, nullable = false) // nullable fala que é um campo not nnull
	private String nacionalidade;
	
	@Column(nullable = false) // nullable fala que é um campo not nnull
	private LocalDate dataNascimento;
	
	@OneToMany(mappedBy = "autor") // UM AUTOR PARA VARIOS LIVROS, MAPEADO PELA ENTIDADE AUTOR "autor" ( QUE ESTA NA TABELA DE LIVROS)
	private List<Livro> livros;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	
	
	
}

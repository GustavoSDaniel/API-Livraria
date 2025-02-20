package dev.gustavosdaniel.apilivraria.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data //UMA ANOTAÇÃO DO LOMBOK PARA SUBSTITUIR GAT SET TOSTRING HASCODE
@Entity
@Table(name = "livro_db")
public class Livro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 20, nullable = false) // nullable fala que é um campo not nnull
	private String isbn;
	
	@Column(length = 150, nullable = false) // nullable fala que é um campo not nnull
	private String titulo;
	
	@Column(nullable = false) // nullable fala que é um campo not nnull
	private LocalDate dataPublicacao;
	
	@Enumerated(EnumType.STRING) // quando coloca um tipo enum tem que colocar essa anotação nessec caso foi STRING pq está guardando na classe GENEROLLIVRO NOMES DE GENEROS 
	@Column(length = 30, nullable = false)
	private GeneroLivro generoLivro;
	
	@Column() // nullable fala que é um campo not nnull e precision fala que pode ter até 18 algoritimos com até 2 numeros depois da virgula
	private Double preco;
	
	@ManyToOne // MUITOS LIVROS PARA UM AUTOR
	@JoinColumn() //SERVE PARA MOSTRAR QUE É UM RELACIONAMENTO FK
	private Autor autor;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDate getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(LocalDate dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public GeneroLivro getGenero() {
		return generoLivro;
	}

	public void setGenero(GeneroLivro genero) {
		this.generoLivro = genero;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
}

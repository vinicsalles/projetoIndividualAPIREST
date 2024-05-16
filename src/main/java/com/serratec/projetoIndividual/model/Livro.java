package com.serratec.projetoIndividual.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="livro")
public class Livro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_livro")
	private Long id;
	
	@Column
	@NotBlank(message="Preencha o título")
	@Size(max = 40, message="Tamanho máximo 40")
	private String titulo;
	
	@Embedded
	private InfoPubli informacaoPublicacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public InfoPubli getInformacaoPublicacao() {
		return informacaoPublicacao;
	}

	public void setInformacaoPublicacao(InfoPubli informacaoPublicacao) {
		this.informacaoPublicacao = informacaoPublicacao;
	}

	
	
	

}

package com.serratec.projetoIndividual.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Embeddable
public class InfoPubli {
	@Column(name="autor", nullable=false)
	@NotBlank(message="Preencha o Autor")
	@Size(max = 40, message="Tamanho máximo 40")
	private String autor;
	
	@Column(name="dataPublicacao", nullable=false)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	@NotNull
	private Date dataPublicacao;
	
	@Column(name="editor", nullable=false)
	@NotBlank(message="Preencha o Editora")
	@Size(max = 40, message="Tamanho máximo 40")
	private String editora;
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Date getDataPublicacao() {
		return dataPublicacao;
	}
	public void setDataPublicacao( Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	
	
}

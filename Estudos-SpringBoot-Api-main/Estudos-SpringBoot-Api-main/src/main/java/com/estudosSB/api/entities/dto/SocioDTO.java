package com.estudosSB.api.entities.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;





public class SocioDTO implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	private Long id;
	
	
	@NotBlank
	@Size(min = 3)
	private String nome;
	
	@NotBlank
	private String formadePagamento;
	
	
	
	
	

	public SocioDTO() {
		
	}

	public SocioDTO(Long id, String nome, String formadePagamento) {
		super();
		this.id = id;
		this.nome = nome;
		this.formadePagamento = formadePagamento;
	}

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

	public String getFormadePagamento() {
		return formadePagamento;
	}

	public void setFormadePagamento(String formadePagamento) {
		this.formadePagamento = formadePagamento;
	}
	
	
	
	

}

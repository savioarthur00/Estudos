package com.estudosSB.api.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="Socios")
public class Socio implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String formaPagamento;
	
	private String nome;
	
	
	@OneToMany(mappedBy = "socio")	
	private List<Mensalidade> mensalidades = new ArrayList<>();
	
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	@CreationTimestamp
	@Column(name="date_created")
	private LocalDateTime dateCreated;
	
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	@UpdateTimestamp
	@Column(name="date_update")
	private LocalDateTime dateUpdate;
	
	
	

	public Socio() {
		super();
	}



	public Socio(String formaPagamento, String nome) {
		super();
		this.formaPagamento = formaPagamento;
		this.nome = nome;
				
		int numero_de_mensalidades = 1;
		while (numero_de_mensalidades<13) {
			
			Mensalidade mensalidade = new Mensalidade();
			mensalidade.setName(numero_de_mensalidades + " / " + " 2023");
			mensalidade.setStatus("à pagar");
			mensalidade.setValor(70);
			mensalidade.setSocio(this);
			
			mensalidades.add(mensalidade);
			numero_de_mensalidades ++;
			
		}
	}



	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public LocalDateTime getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}

	public LocalDateTime getDateUpdate() {
		return dateUpdate;
	}

	public void setDateUpdate(LocalDateTime dateUpdate) {
		this.dateUpdate = dateUpdate;
	}




	



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public List<Mensalidade> getMensalidades() {
		return mensalidades;
	}








	public void setMensalidades(List<Mensalidade> mensalidades) {
		this.mensalidades = mensalidades;
	}

	






	









	

	
	

	
	

	

	

	
	
	

}

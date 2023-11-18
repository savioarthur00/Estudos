package com.estudosSB.api.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name= "Mensalidades")

public class Mensalidade implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private int valor;
	
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	@CreationTimestamp
	@Column(name="date_Created")
	private LocalDateTime dateCreated;
	
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	@UpdateTimestamp
	@Column(name="date_update")
	private LocalDateTime dateUpdate;
	
	@ManyToOne
	@JoinColumn(name="socio_id")
	private Socio socio;
	
	private String status;

	private String name;

	public Mensalidade(int valor, Socio socio) {
		super();
		this.valor = valor;
		this.socio = socio;
	}




	public Mensalidade() {
	
		
		
	}



	public String getStatus() {
		return status;
	}




	public void setStatus(String status) {
		this.status = status;
	}




	public int getValor() {
		return valor;
	}



	










	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public void setValor(int valor) {
		this.valor = valor;
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













	public Socio getSocio() {
		return socio;
	}




	public void setSocio(Socio socio) {
		this.socio = socio;
	}
	
	
	
	
	
	

}

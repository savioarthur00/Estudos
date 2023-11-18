package com.estudosSB.api.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "Usuarios")
public class Usuario implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	private String cargo;
	
	//Não persiste no banco de dados
	@Transient
	private float salario;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "login_id",
				referencedColumnName ="id"
				)
	@MapsId
	Login login;
	
	@Transient
	@CreationTimestamp
	@Column(name="date_created")
	private LocalDateTime dateCreated;
	
	@Transient
	@UpdateTimestamp
	@Column(name="date_update")
	private LocalDateTime dateUpdate;
	
	
	private String Usuario_criador;
	
	@PostPersist
	private void aposPersistirDados() {
		this.name= this.name +"POST";
	}
	
	@PrePersist
	private void antesDePersistirDados() {
		this.Usuario_criador = login.getLogin();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
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

	public String getUsuario_criador() {
		return Usuario_criador;
	}

	public void setUsuario_criador(String usuario_criador) {
		Usuario_criador = usuario_criador;
	}

	public Usuario() {
		
	}
	
	
	
	

}

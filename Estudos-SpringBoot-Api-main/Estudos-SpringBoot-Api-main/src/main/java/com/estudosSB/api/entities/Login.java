package com.estudosSB.api.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "Logins")
public class Login implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	private String login;
	
	private String senha;
	
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	@CreationTimestamp
	@Column(name="date_created")
	private LocalDateTime dateCreated;
	
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	@UpdateTimestamp
	@Column(name="date_update")
	private LocalDateTime dateUpdate;
	
	
	
	@Override
	public String toString() {
		return "Login [id=" + id + ", login=" + login + ", senha=" + senha + "]";
	}


	public Login() {
		
	}
	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
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




	
	
	
}

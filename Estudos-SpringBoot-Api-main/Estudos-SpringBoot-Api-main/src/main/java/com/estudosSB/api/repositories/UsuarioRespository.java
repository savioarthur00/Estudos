package com.estudosSB.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudosSB.api.entities.Usuario;

@Repository
public interface UsuarioRespository extends JpaRepository<Usuario, Long>  {

	

	
	
	
	
}

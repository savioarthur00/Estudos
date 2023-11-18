package com.estudosSB.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudosSB.api.entities.Socio;

@Repository
public interface SocioRepository extends JpaRepository<Socio, Long>  {

}

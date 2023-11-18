package com.estudosSB.api.services;

import java.util.List;

import com.estudosSB.api.entities.Socio;

public interface SocioService {
	
	
	public List<Socio> getSocio();
	
	public Socio save(Socio socio);

}

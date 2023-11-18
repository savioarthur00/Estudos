package com.estudosSB.api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudosSB.api.entities.Socio;
import com.estudosSB.api.repositories.SocioRepository;
import com.estudosSB.api.services.SocioService;

@Service
public class SocioServiceImpl implements SocioService {
	
	@Autowired
	private SocioRepository socioRepository;
	

	@Override
	public List<Socio> getSocio() {
		
		return socioRepository.findAll();
	}


	@Override
	public Socio save(Socio socio) {
		return socioRepository.save(socio);
	}
	
	

}

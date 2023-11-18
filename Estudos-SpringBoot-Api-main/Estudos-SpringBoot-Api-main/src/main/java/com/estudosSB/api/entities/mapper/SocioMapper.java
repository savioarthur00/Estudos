package com.estudosSB.api.entities.mapper;

import org.springframework.stereotype.Service;

import com.estudosSB.api.entities.Socio;
import com.estudosSB.api.entities.dto.SocioDTO;


@Service
public class SocioMapper {
	
	public Socio mapSocioDTOToSocio (SocioDTO dto) {
		
		Socio socio = new Socio(dto.getFormadePagamento(), dto.getNome());
		return socio;
		
	}

}

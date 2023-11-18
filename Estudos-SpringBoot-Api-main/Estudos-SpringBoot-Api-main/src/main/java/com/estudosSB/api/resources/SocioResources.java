package com.estudosSB.api.resources;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudosSB.api.entities.Socio;
import com.estudosSB.api.entities.dto.SocioDTO;
import com.estudosSB.api.entities.mapper.SocioMapper;
import com.estudosSB.api.services.SocioService;

@RestController
@RequestMapping("/socios")
public class SocioResources {
	
	@Autowired
	private SocioService socioService;
	
	@Autowired
	private SocioMapper socioMapper;
	
	@GetMapping
	public ResponseEntity<List<Socio>> getSocios() {
			
		List<Socio> socios = socioService.getSocio();
		
			return ResponseEntity.ok().body(socios);
		
	}
	
	@PostMapping("/salvar")
	public ResponseEntity<Socio> saveSocio(@Valid @RequestBody SocioDTO sociodto) throws URISyntaxException{
		
		Socio novo_socio = socioService.save(socioMapper.mapSocioDTOToSocio(sociodto));
		
		return ResponseEntity.created(new URI("/cursos/salvar/" + novo_socio.getId())).body(novo_socio);
		
	}

}

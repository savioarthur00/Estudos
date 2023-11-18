package com.estudosSB.api.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class TestResources {

	@GetMapping("/oi")
	public String getOi() {
		return "Oi";
	}
	
	@GetMapping(value = "/ola")
	public String getOla() {
		return "Olá";
	}
}

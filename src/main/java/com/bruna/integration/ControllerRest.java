package com.bruna.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bruna.entities.Frase;
import com.bruna.entities.Testo;
import com.bruna.services.FraseService;
import com.bruna.services.ParolaService;
import com.bruna.services.TestoService;

@RestController
@RequestMapping("/api")
public class ControllerRest {

	@Autowired
	private TestoService service;
	
	@Autowired
	private FraseService fservice;
	
	@Autowired
	private ParolaService pservice;
	
	@GetMapping("/testi")
	List<Testo> getTesto(){
		return service.getTesti();
	}
	
	@GetMapping("/parolaPL")
	String parolaPL() {
		return service.parolaPL(6);
	}
	
	@PostMapping("/testi")
	Testo addTesto(Testo t) {
		fservice.addFrase(t);
		pservice.addParola(t);
		return service.addTesto(t);
	}
	
}


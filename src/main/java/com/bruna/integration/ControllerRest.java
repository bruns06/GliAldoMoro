package com.bruna.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bruna.entities.Testo;
import com.bruna.services.TestoService;

@RestController
@RequestMapping("api")
public class ControllerRest {

	@Autowired
	private TestoService service;
	
	@GetMapping("testi")
	List<Testo> getTesto(){
		return service.getTesti();
	}
	
	@PostMapping("testi")
	Testo addTesto(@RequestBody Testo t) {
		return service.addTesto(t);
	}
}

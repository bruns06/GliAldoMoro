/*
 * @file: ControllerRest.java
 * @about: Classe che rappresenta le chiamate api al db
 * @path: /api/foobar
 */

package com.bruna.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
public class ControllerRest {
	//SERVIZI
	@Autowired
	private TestoService service;
	
	@Autowired
	private FraseService fservice;
	
	@Autowired
	private ParolaService pservice;
	
	//Get Requests
	@ModelAttribute("testiModelAttribute")
	@GetMapping("api/testi")
	List<Testo> getTesto(){
		return service.getTesti();
	}

	
}


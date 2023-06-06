package com.bruna.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bruna.entities.Testo;
import com.bruna.services.TestoService;
import com.bruna.repo.FraseDAO;
import com.bruna.repo.ParolaDAO;
import com.bruna.repo.TestoDAO;

@Controller
public class ControllerMVC {

	@Autowired
	private TestoService service;
	@Autowired
	private TestoDAO dao;
	@Autowired
	private FraseDAO fdao;
	@Autowired
	private ParolaDAO pdao;
	
	
	@GetMapping("/testiPresenti")
	public String showTesti (Model m) {
		m.addAttribute("testi", dao.findAll());
		m.addAttribute("numeroFrasi", fdao.count());
		m.addAttribute("numeroParole", pdao.count());
		return "testi.html";
	}
}

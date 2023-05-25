package com.bruna.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bruna.entities.Parola;
import com.bruna.entities.Testo;
import com.bruna.repo.ParolaDAO;
@Service
public class ParolaServiceImpl implements ParolaService{
	@Autowired
	private ParolaDAO pdao;
	
	@Override
	public void addParola(Testo t) {
		String testo = t.getTxt();
		testo.trim();
		String[] sentences = testo.split("(\\s)");
		  for (String parola : sentences) {
	            Parola p = new Parola();
	            p.setContenuto(parola);
	            pdao.save(p);
	        }
	}
}

package com.bruna.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bruna.entities.Frase;
import com.bruna.entities.Parola;
import com.bruna.entities.Testo;
import com.bruna.repo.FraseDAO;
import com.bruna.repo.ParolaDAO;
import com.bruna.repo.TestoDAO;

@Service
public class TestoServiceImpl implements TestoService {
	@Autowired
	private TestoDAO tdao;
	@Autowired
	private FraseDAO fdao;
	@Autowired
	private ParolaDAO pdao;
	
	@Override
	public void addTesto(Testo t) {
		String testo = t.getTxt();
		String testo2 = t.getTxt();
		tdao.save(t);
		testo.trim();
		String[] sentences = testo.split("(\\.)|(\\:)");
		String[] parole = testo2.split("(\\s)");
		System.out.println(sentences[0]);
		  for (String frase : sentences) {
	         
			  	Frase f = new Frase();
	            f.setContenuto(frase);
	            f.setTesto(t);
	            fdao.save(f);
		  }
		  
		  for (String parola : parole) {
	            Parola p = new Parola();
	            p.setContenuto(parola);
	            p.setTesto(t);
	            pdao.save(p);
	        }
	}

	@Override
	public List<Testo> getTesti() {
		return tdao.findAll();
	}
 
	@Override
	public Testo getTesto(int id) {
		return tdao.findById(id).get();
	}

	@Override
	public String parolaPL(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

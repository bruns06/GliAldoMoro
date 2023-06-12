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
		String parolaPiuLunga = "";
	  	String frasePiuLunga = "";
		String[] sentences = testo.split("(\\.)|(\\:)");
		String[] parole = testo2.split("(\\s)");
		for (String frase : sentences) {
			if(frase.length() > frasePiuLunga.length()) {
				frasePiuLunga = frase;
			}
		}
		for (String par : parole) {
			if(par.length() > parolaPiuLunga.length()) {
				parolaPiuLunga = par;
			}
		}
		t.setParolaPiuLunga(parolaPiuLunga);
		t.setFrasePiuLunga(frasePiuLunga);
		tdao.save(t);
		testo.trim();
		t.setNumeroFrasi(sentences.length);
		t.setNumeroParole(parole.length);
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
	public String parolaPL(int id) {

		return null;
	}
	

}

package com.bruna.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bruna.entities.Frase;
import com.bruna.entities.Testo;
import com.bruna.repo.FraseDAO;

@Service
public class FraseServiceImpl implements FraseService {
	private FraseDAO fdao;
	
	@Autowired
	public FraseServiceImpl(FraseDAO fdao) {
		this.fdao = fdao;
	}
	
	@Override
	public void addFrase(Testo t) {
		String testo = t.getTxt();
		
	    }
	}
	


package com.bruna.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bruna.entities.Testo;
import com.bruna.repo.TestoDAO;

@Service
public class TestoServiceImpl implements TestoService {
	@Autowired
	private TestoDAO dao;
	
	@Override
	public Testo addTesto(Testo t) {
		return dao.save(t);
	}

	@Override
	public List<Testo> getTesti() {
		return dao.findAll();
	}

}

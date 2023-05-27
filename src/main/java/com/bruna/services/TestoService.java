package com.bruna.services;

import java.util.List;
import com.bruna.entities.Testo;

public interface TestoService {
	void addTesto(Testo t);
	List<Testo> getTesti();
	Testo getTesto(int id);
	String parolaPL(int id);
}

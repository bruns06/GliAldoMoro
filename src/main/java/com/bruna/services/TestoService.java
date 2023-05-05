package com.bruna.services;

import java.util.List;
import com.bruna.entities.Testo;

public interface TestoService {
	Testo addTesto(Testo t);
	List<Testo> getTesti();
	
}

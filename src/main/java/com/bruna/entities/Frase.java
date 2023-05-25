package com.bruna.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "frase")
public class Frase {
	public List<Parola> getParole() {
		return parole;
	}

	public void setParole(List<Parola> parole) {
		this.parole = parole;
	}

	public void setFrase(Frase frase) {
		this.frase = frase;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_frase;
	private String contenuto;
	
	@ManyToOne
	@JoinColumn(name = "id_testo")
	private Frase frase;

	public void setId_frase(int id_frase) {
		this.id_frase = id_frase;
	}

	@OneToMany(mappedBy = "id_parola")
	private List<Parola> parole = new ArrayList<Parola>();
	
	public String getContenuto() {
		return contenuto;
	}

	public void setContenuto(String contenuto) {
		this.contenuto = contenuto;
	}

	public int getId_frase() {
		return id_frase;
	}

	public Frase getFrase() {
		return frase;
	}
	
}

package com.bruna.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "parola")
public class Parola {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_parola;
	private String contenuto;
	
	public String getContenuto() {
		return contenuto;
	}

	public void setContenuto(String contenuto) {
		this.contenuto = contenuto;
	}

	public int getId_parola() {
		return id_parola;
	}

	public Parola getParola() {
		return parola;
	}

	@ManyToOne
	@JoinColumn(name = "id_frase")
	private Parola parola;
}

/*
 * @file: Parola.java
 * @about: Classe che rappresenta l'entità parola nel database
 * @FK: testo
 */

package com.bruna.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

//Rappresenta la tabella parola nel testo
@Entity
@Table(name = "parola")
public class Parola {
	
	//ENTITA' TABELLA
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String contenuto;
	
	//GETTERS AND SETTERS
	
	public String getContenuto() {
		return contenuto;
	}

	public void setContenuto(String contenuto) {
		this.contenuto = contenuto;
	}

	public int getId_parola() {
		return id;
	}

	//Chiave esterna, punta a testoID
	@ManyToOne
	private Testo testo;

	public Testo getTesto() {
		return testo;
	}

	public void setTesto(Testo testo) {
		this.testo = testo;
	}
	
}
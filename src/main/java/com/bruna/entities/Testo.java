/*
 * @file: Testo.java
 * @about: Classe che rappresenta l'entità madre testo nel database
 */

package com.bruna.entities;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

//Rappresenta la tabella testo nel db
@Entity
@Table(name = "testo")
public class Testo {
	
	//ENTITA' TABELLA
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 8000)
	private String contenuto;
	private String parola_più_lunga;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "testo")
	private List<Frase> frase = new ArrayList<Frase>();
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "testo")
	private List<Parola> parole = new ArrayList<Parola>();
	
	//GETTERS AND SETTERS
	
	public List<Parola> getParole() {
		return parole;
	}

	public void setParole(List<Parola> parole) {
		this.parole = parole;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTxt() {
		return contenuto;
	}
	
	public void setTxt(String txt) {
		this.contenuto = txt;
	}

	public String getParolaPL() {
		return parola_più_lunga;
	}

	public void setParolaPL(String parolaPL) {
		this.parola_più_lunga = parolaPL;
	}	
	
}

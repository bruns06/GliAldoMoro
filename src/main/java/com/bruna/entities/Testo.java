package com.bruna.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "testo")
public class Testo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_testo;
	@Column(length = 8000)
	private String contenuto;
	private String parola_più_lunga;
	
	@OneToMany(mappedBy = "id_frase")
	private List<Frase> frase = new ArrayList<Frase>();
	
	public int getId() {
		return id_testo;
	}
	
	public void setId(int id) {
		this.id_testo = id;
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

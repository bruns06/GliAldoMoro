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
@Table(name = "paragrafo")
public class Paragrafo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_paragrafo;
	private String contenuto;
	@ManyToOne
	@JoinColumn(name = "id_testo")
	private Paragrafo paragrafo;
	
	@OneToMany(mappedBy = "id_frase")
	private List<Frase> frasi = new ArrayList<Frase>();
	
	public String getContenuto() {
		return contenuto;
	}
	public void setContenuto(String contenuto) {
		this.contenuto = contenuto;
	}
	public int getId() {
		return id_paragrafo;
	}
	public Paragrafo getParagrafo() {
		return paragrafo;
	}
}

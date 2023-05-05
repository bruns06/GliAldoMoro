package com.bruna.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "testo")
public class Testo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String txt;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTxt() {
		return txt;
	}
	
	public void setTxt(String txt) {
		this.txt = txt;
	}	
}

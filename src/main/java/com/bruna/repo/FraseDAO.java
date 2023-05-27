package com.bruna.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bruna.entities.Frase;

public interface FraseDAO extends JpaRepository<Frase, Integer> {

}

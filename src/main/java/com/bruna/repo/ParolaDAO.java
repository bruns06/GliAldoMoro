package com.bruna.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bruna.entities.Parola;

public interface ParolaDAO extends JpaRepository<Parola, Integer> {

}

package com.serratec.projetoIndividual.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.serratec.projetoIndividual.model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

}

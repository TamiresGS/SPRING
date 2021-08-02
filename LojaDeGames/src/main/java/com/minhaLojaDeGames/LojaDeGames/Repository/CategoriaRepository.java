package com.minhaLojaDeGames.LojaDeGames.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minhaLojaDeGames.LojaDeGames.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> { 
	
	public List<Categoria> findAllByTituloContainingIgnoreCase(String titulo); //BUSCA TODO QUE CONTÉM EM TÍTULO //IGNORANDO MAIUSCULAS E MINUSCULAS OU SEJA PATRONIZANDO TUDO PARA MINUSCULAS

}
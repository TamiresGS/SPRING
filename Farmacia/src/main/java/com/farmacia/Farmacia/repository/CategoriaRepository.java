package com.farmacia.Farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacia.Farmacia.model.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Long> { 
		
		public List<Categoria> findAllByTituloContainingIgnoreCase(String titulo); //BUSCA TODO QUE CONTÉM EM TÍTULO //IGNORANDO MAIUSCULAS E MINUSCULAS OU SEJA PATRONIZANDO TUDO PARA MINUSCULAS

}

package org.generation.blogPessoal.repository;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	
	public List<Postagem> findAllByTituloContainingIgnoreCase(String titulo); //BUSCA TODO QUE CONTÉM EM TÍTULO //IGNORANDO MAIUSCULAS E MINUSCULAS OU SEJA PATRONIZANDO TUDO PARA MINUSCULAS

}

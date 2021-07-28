package org.generation.blogPessoal.controller;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.generation.blogPessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//CONFIGURANDO O CONTROLLER
@RestController										// INFORMANDO QUE É UM CONTROLLER
@RequestMapping("/postagem")						// INFORMANDO QUAL URL SERÁ ACESSADA (ROTA)
@CrossOrigin(value = "*", allowedHeaders = "*")		// INFORMANDO QUE ACEITARÁ REQUISIÇÃO DE QUALQUER ORIGEM
public class PostagemController {
	
	@Autowired		
	private PostagemRepository repository;
	 
	
	@GetMapping						//SE A REQUISIÇÃO FOR GET IRÁ ASIONAR ESSE MÉTODO
	public ResponseEntity<List<Postagem>>GetAll()
	{
		return ResponseEntity.ok(repository.findAll());		
	}
	
	
	@GetMapping("/{id}")     
	public ResponseEntity<Postagem> GetById(@PathVariable long id)
	{
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	
	
	
}

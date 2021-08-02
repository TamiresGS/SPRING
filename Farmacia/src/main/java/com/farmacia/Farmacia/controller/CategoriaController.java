package com.farmacia.Farmacia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.farmacia.Farmacia.model.Categoria;
import com.farmacia.Farmacia.repository.CategoriaRepository;


public class CategoriaController {
	
	@Autowired
	private CategoriaRepository repository;

	@GetMapping // SE A REQUISICAO FOR GET IRA ASIONAR ESSE MÉTODO
	public ResponseEntity<List<Categoria>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Categoria> GetById(@PathVariable long id) {
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}

	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<Categoria>> GetByTitulo(@PathVariable String titulo) {
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
		
	}

	@PostMapping  // SALVAR
	public ResponseEntity<Categoria> post(@RequestBody Categoria categoria) { //FARA UM PEDIDO PELO BODY
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));
	}

	@PutMapping //ATUALIZAR
	public ResponseEntity<Categoria> put(@RequestBody Categoria categoria) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(categoria));
	}

	@DeleteMapping ("/{id}") //DELETAR
	public void delete(@PathVariable long id)
	{
		repository.deleteById(id);
	} 

	

}

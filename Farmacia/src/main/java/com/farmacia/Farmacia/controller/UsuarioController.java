package com.farmacia.Farmacia.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farmacia.Farmacia.model.UserLogin;
import com.farmacia.Farmacia.model.Usuario;
import com.farmacia.Farmacia.servece.UsuarioService;

@RestController
	@RequestMapping
	@CrossOrigin (origins = "*", allowedHeaders = "*")
	public class UsuarioController {
		
		@Autowired
		private UsuarioService usuarioService;
		
		@PostMapping ("/logar")
		public ResponseEntity<UserLogin> Autentication(@RequestBody Optional <UserLogin> user){
			return usuarioService.Logar(user).map(resp -> ResponseEntity.ok(resp))
					.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
			
		}
		@PostMapping ("/cadastrar")
		public ResponseEntity<Usuario> Post(@RequestBody Usuario usuario ){
			return ResponseEntity.status(HttpStatus.CREATED)
					.body(usuarioService.CadastrarUsuario(usuario));
		
		}	
		
	}

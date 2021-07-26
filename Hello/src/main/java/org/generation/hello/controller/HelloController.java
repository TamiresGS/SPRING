package org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //ESTOU DIZENDO QUE É UM CONTROLLER
@RequestMapping ("/hello") // PODE SER REQUESITADA DA URL

public class HelloController {  //CRIANDO OS MÉTODOS
	
	@GetMapping ("/hellohabilidade") // CAMINHO PARA ACESSAR ESSE MÉTODO
	public String Habilidade ()
	{
		return " Perscistência no nível hard";
	}

	@GetMapping ("/helloobjetivo")  // CAMINHO PARA ACESSAR ESSE MÉTODO
	public String Objetivo ()
	{
		return "Spring colabora porfavor, please!";
	}
	
}




package br.ifpe.web3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.ifpe.web3.modelCadastro.Usuario;

@Controller
public class RotasController {

	@GetMapping("/")
	public String Home() {
		return "index";
	}
	
	@GetMapping("/sobre")
	public String sobre() {
		return "sobre";
	}

	@GetMapping("/galeria")
	public String galeria() {
		return "galeria";
	}
	
	@GetMapping("/contato")
	public String contato() {
		return "contato";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/registro")
	public String registro(Usuario usuario) {
		return "registro";
	}
	
	@GetMapping("/home")
	public String HomeAdmin() {
		return "home";
	}
	
}

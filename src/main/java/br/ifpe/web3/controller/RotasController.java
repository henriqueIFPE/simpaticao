package br.ifpe.web3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.ifpe.web3.modelCadastro.Usuario;
import br.ifpe.web3.service.UsuarioService;

@Controller
public class RotasController {

	
	@Autowired
	private UsuarioService usuarioServices;
	
	
	
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
	
	@PostMapping("/novoUsuario")
	public String novoUsuario(Usuario usuario) {
		this.usuarioServices.save(usuario);
		
		return "redirect:/login";
	}
	
	@GetMapping("/home")
	public String HomeAdmin() {
		return "home";
	}
	
}

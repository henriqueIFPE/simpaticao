package br.ifpe.web3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RotasController {

	@GetMapping("/")
	public String Home() {
		return "index";
	}
	
	@GetMapping("/sobre")
	public String sobre() {
		return "about";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/home")
	public String HomeAdmin() {
		return "home";
	}
	
}

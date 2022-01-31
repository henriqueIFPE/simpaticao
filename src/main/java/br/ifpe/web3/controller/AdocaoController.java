package br.ifpe.web3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.ifpe.web3.modelCadastro.Adocao;
import br.ifpe.web3.service.AdocaoServices;
import br.ifpe.web3.service.PetServices;
import br.ifpe.web3.service.UsuarioService;

@Controller
public class AdocaoController {

	@Autowired
	private AdocaoServices adocaoServices;

	@Autowired
	private PetServices petServices;
	
	@Autowired
	private UsuarioService usuarioService;
	
	
	@GetMapping("/adocao")
	public String adocao(Adocao adocao, ModelMap model ) {
		
		//model.addAttribute("usuarios", this.usuarioService.findAll());
		model.addAttribute("pets", this.petServices.findAll());
		
		return "usuario/adocao";
	}
	
	@PostMapping("/salvarAdocao")
	public String salvarAdoacao(Adocao adocao) {
		
		this.adocaoServices.save(adocao);
		
		return "redirect:/adocao";
	}
	
}

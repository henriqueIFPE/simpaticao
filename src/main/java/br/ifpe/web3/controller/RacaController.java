package br.ifpe.web3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.ifpe.web3.modelCadastro.Raca;
import br.ifpe.web3.service.RacaServices;

@Controller
public class RacaController {

	@Autowired
	private RacaServices services;
	
	@GetMapping("/raca-form")
	public String raca(Raca raca,ModelMap model) {
		model.addAttribute("racas", this.services.findAll());
		return "pets/raca_form";
	}
	
	@PostMapping("/inserirRaca")
	public String inserirRaca(Raca raca) {
		this.services.save(raca);
		return"redirect:/raca-form";
	}
	
}

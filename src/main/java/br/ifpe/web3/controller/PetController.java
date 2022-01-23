package br.ifpe.web3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.ifpe.web3.modelCadastro.Pet;
import br.ifpe.web3.service.PetServices;

@Controller
public class PetController {

	private PetServices petservices;
	
	@GetMapping("/form-pet")
	public String cadastrar(Pet pet, ModelMap model) {
		
		model.addAttribute("pets", this.petservices.findAll());
		return "/pets/pet-form";
	}
	
}

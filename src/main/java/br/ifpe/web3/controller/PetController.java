package br.ifpe.web3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.ifpe.web3.modelCadastro.Pet;
import br.ifpe.web3.modelCadastro.Porte;
import br.ifpe.web3.service.PetServices;
import br.ifpe.web3.service.RacaServices;

@Controller
public class PetController {

	@Autowired
	private PetServices petservices;
	
	@Autowired
	private RacaServices racaservices;
	

	
	@GetMapping("/form-pet")
	public String cadastrar(Pet pet, ModelMap model) {
		model.addAttribute("pets", this.petservices.findAll());
		model.addAttribute("racas", this.racaservices.findAll());
			
		return "/pets/pet-form";
	}
	
	@GetMapping("/listaPets")
	public String ListaPets(Pet pet, ModelMap model) {
		model.addAttribute("pets", this.petservices.findAll());
		
		return "/pets/lista_pets";
	}
	
	@PostMapping("/inserirPet")
	public String inserirPet(Pet pet) {
		this.petservices.save(pet);
		
		return "redirect:/form-pet";
	}
	
	
	
///--------------------------------------------------------------------------------------------------//	


	
	
//--------------------------------------------------------------------------------------------------//
}

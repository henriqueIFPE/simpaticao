package br.ifpe.web3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.ifpe.web3.modelCadastro.Usuario;
import br.ifpe.web3.service.UsuarioService;

@Controller
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioServices;
	
	@GetMapping("/usuario")
	public String cadastrarUsuario(Usuario usuario, ModelMap model) {
		model.addAttribute("usuarios", this.usuarioServices.findAll());
		
		
		return "usuario/usuario_form";
	}

	@PostMapping("/inserirUsuario")
	public String salvarUsuario(Usuario usuario) {
		this.usuarioServices.save(usuario);
		
		return "redirect:/usuario";
	}

}

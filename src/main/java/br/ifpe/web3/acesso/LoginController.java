package br.ifpe.web3.acesso;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.ifpe.web3.dao.UsuarioDAO;
import br.ifpe.web3.modelCadastro.Usuario;
import br.ifpe.web3.service.UsuarioService;
import br.ifpe.web3.util.Util;

@Controller
public class LoginController {

	private UsuarioDAO usuarioDAO;
	
	@Autowired
	private UsuarioService UsuarioService;	
	
	@PostMapping("/efetuarLogin")
	public String efetuarLogin(Usuario usuario,
			RedirectAttributes ra,
			HttpSession session) {
		
		usuario = this.usuarioDAO.findByLoginAndSenha(
				usuario.getLogin(), Util.md5(usuario.getSenha()));
		
		if (usuario != null) {
			// Guardar sessao o objeto usuario
			session.setAttribute("usuarioLogado", usuario);
			return "redirect:/home";
		} else {
			// Enviar uma mensagem 
			ra.addFlashAttribute("mensagem", "Login/senha inválidos");
			return "redirect:/";
		}
	}
	
	@PostMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}

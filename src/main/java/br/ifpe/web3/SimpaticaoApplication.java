package br.ifpe.web3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.ifpe.web3.service.UsuarioService;

@SpringBootApplication
public class SimpaticaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpaticaoApplication.class, args);
	}
	
	private UsuarioService usuarioService;
	
	public void run(String... args) throws Exception {
		System.out.println("Inicializando dados.. ");
		System.out.println("Qtd usuários: " + this.usuarioService.obterQuantidade());
		System.out.println("Criando usuário admin");
		this.usuarioService.criarUsuarioAdmin();
		
		System.out.println("Qtd usuários: " + this.usuarioService.obterQuantidade());
	}
}

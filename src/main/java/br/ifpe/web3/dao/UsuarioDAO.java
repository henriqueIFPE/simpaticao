package br.ifpe.web3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ifpe.web3.modelCadastro.Usuario;

public interface UsuarioDAO extends JpaRepository<Usuario, Integer>{

	//public Usuario findByLoginAndSenha(String login, String senha);
	
//	public boolean existsByLogin(String login);
	
//	public Usuario findByLogin(String login);
}

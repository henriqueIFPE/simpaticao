package br.ifpe.web3.modelCadastro;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.ifpe.web3.modelCadastro.Perfil;
import br.ifpe.web3.modelCadastro.SituacaoUsuario;

public class Usuario extends Pessoa {

	@Column(length = 70, nullable = false)
	private String nome;
	@Column(length = 40, nullable = false, unique = true)
	private String login;
	@Column(length = 40, nullable = false)
	private String senha;
	@Enumerated(EnumType.STRING)
	@Column(length = 15, nullable = false)
	private Perfil perfil;
	@Enumerated(EnumType.STRING)
	@Column(length = 15, nullable = false)
	private SituacaoUsuario situacaoUsuario;
}

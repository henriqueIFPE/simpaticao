package br.ifpe.web3.modelCadastro;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.ifpe.web3.modelCadastro.Perfil;
import br.ifpe.web3.modelCadastro.SituacaoUsuario;

@Entity
public class Usuario extends Pessoa {

	@Column(length = 70, nullable = false)
	private String nome;
	@Column(length = 40, nullable = false, unique = true)
	private String login;
	@Column(length = 40, nullable = false)
	private String senha;
	@Column(length = 13)
	private String cpf;	
	@Enumerated(EnumType.STRING)
	@Column(length = 15)
	private Perfil perfil;
	@Enumerated(EnumType.STRING)
	@Column(length = 15)
	private SituacaoUsuario situacaoUsuario;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Perfil getPerfil() {
		return perfil;
	}
	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	public SituacaoUsuario getSituacaoUsuario() {
		return situacaoUsuario;
	}
	public void setSituacaoUsuario(SituacaoUsuario situacaoUsuario) {
		this.situacaoUsuario = situacaoUsuario;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	
}

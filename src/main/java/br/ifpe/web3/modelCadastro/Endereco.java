package br.ifpe.web3.modelCadastro;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class Endereco {
	
	@Enumerated(EnumType.STRING)
	private UF uf;
	
	@Column(name = "EStado",length = 50)
	private String cidade;
	
	@Column(name = "Bairro")
	private String bairro;
	
	@Column(length = 15)
	private String cep;
	
	@SuppressWarnings("unused")
	private String complemento;

	@SuppressWarnings("unused")
	private String casa;

	public UF getUf() {
		return uf;
	}

	public void setUf(UF uf) {
		this.uf = uf;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCasa() {
		return casa;
	}

	public void setCasa(String casa) {
		this.casa = casa;
	}

	
}
package br.ifpe.web3.modelCadastro;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class Pet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_mascote")
	private Integer codigo;
	
	@Column(name = "nome_mascote", length = 50)
	private String nome;
	@Column(name = "raca_mascote", length = 30)
	private String raca;
	
	private Integer Idade;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public Integer getIdade() {
		return Idade;
	}

	public void setIdade(Integer idade) {
		Idade = idade;
	}
	
	
}

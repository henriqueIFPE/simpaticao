package br.ifpe.web3.modelCadastro;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;

@MappedSuperclass
public abstract class Pessoa {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	
	private String nome;
	private String email;
	private LocalDate dataNascimento;
	private Endereco endereco;
	@Type(type="yes_no")
	private boolean ativo;
	@ManyToOne
	@JoinColumn(name="usuario_criador")
	private Usuario criadoPor;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCriacao;	
	@ManyToOne
	@JoinColumn(name="usuario_alterador")
	private Usuario alteradorPor;
//	@Version
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataUltimaAtualizacao;
	
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public Usuario getCriadoPor() {
		return criadoPor;
	}
	public void setCriadoPor(Usuario criadoPor) {
		this.criadoPor = criadoPor;
	}
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public Usuario getAlteradorPor() {
		return alteradorPor;
	}
	public void setAlteradorPor(Usuario alteradorPor) {
		this.alteradorPor = alteradorPor;
	}
	public Date getDataUltimaAtualizacao() {
		return dataUltimaAtualizacao;
	}
	public void setDataUltimaAtualizacao(Date dataUltimaAtualizacao) {
		this.dataUltimaAtualizacao = dataUltimaAtualizacao;
	}
	
	
}

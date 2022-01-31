package br.ifpe.web3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ifpe.web3.modelCadastro.Adocao;

public interface AdocaoDAO extends JpaRepository<Adocao, Integer> {

}

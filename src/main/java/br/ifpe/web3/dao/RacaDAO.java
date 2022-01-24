package br.ifpe.web3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ifpe.web3.modelCadastro.Raca;

public interface RacaDAO extends JpaRepository<Raca, Integer> {

}

package br.ifpe.web3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ifpe.web3.modelCadastro.Pet;

public interface PetDAO extends JpaRepository<Pet, Integer> {

}

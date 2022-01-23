package br.ifpe.web3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.ifpe.web3.dao.PetDAO;
import br.ifpe.web3.modelCadastro.Pet;

@Service
public class PetServices {

	private PetDAO dao;

	public <S extends Pet> S save(S entity) {
		return dao.save(entity);
	}

	public List<Pet> findAll() {
		return dao.findAll();
	}

	public Optional<Pet> findById(Integer id) {
		return dao.findById(id);
	}

	public boolean existsById(Integer id) {
		return dao.existsById(id);
	}

	public void deleteById(Integer id) {
		dao.deleteById(id);
	}
	
	
	
}

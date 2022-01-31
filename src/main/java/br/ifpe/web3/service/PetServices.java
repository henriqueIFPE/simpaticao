package br.ifpe.web3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ifpe.web3.dao.PetDAO;
import br.ifpe.web3.modelCadastro.Pet;
import br.ifpe.web3.modelCadastro.Porte;
import br.ifpe.web3.util.ServiceException;

@Service
public class PetServices {

	@Autowired
	private PetDAO petDao;


	public <S extends Pet> S save(S entity) {
		return petDao.save(entity);
	}

	public List<Pet> findAll() {
		return petDao.findAll();
	}

	public boolean existsById(Integer id) {
		return petDao.existsById(id);
	}

	public long count() {
		return petDao.count();
	}

	public void deleteById(Integer id) {
		petDao.deleteById(id);
	}

	public void delete(Pet entity) {
		petDao.delete(entity);
	}

	
	
	


	
	
}

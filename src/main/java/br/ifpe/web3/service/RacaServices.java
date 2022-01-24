package br.ifpe.web3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ifpe.web3.dao.RacaDAO;
import br.ifpe.web3.modelCadastro.Raca;

@Service
public class RacaServices {

	@Autowired
	private RacaDAO dao;

	public <S extends Raca> S save(S entity) {
		return dao.save(entity);
	}

	public List<Raca> findAll() {
		return dao.findAll();
	}

	public Optional<Raca> findById(Integer id) {
		return dao.findById(id);
	}

	public boolean existsById(Integer id) {
		return dao.existsById(id);
	}

	public long count() {
		return dao.count();
	}

	public void deleteById(Integer id) {
		dao.deleteById(id);
	}
	
	
	
	
	
}

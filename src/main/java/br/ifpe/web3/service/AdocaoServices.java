package br.ifpe.web3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ifpe.web3.dao.AdocaoDAO;
import br.ifpe.web3.modelCadastro.Adocao;

@Service
public class AdocaoServices {
	
	@Autowired
	private AdocaoDAO adocaoDao;

	public <S extends Adocao> S save(S entity) {
		return adocaoDao.save(entity);
	}

	public List<Adocao> findAllById(Iterable<Integer> ids) {
		return adocaoDao.findAllById(ids);
	}

	public Optional<Adocao> findById(Integer id) {
		return adocaoDao.findById(id);
	}

	public boolean existsById(Integer id) {
		return adocaoDao.existsById(id);
	}

	public void deleteById(Integer id) {
		adocaoDao.deleteById(id);
	}

	public Adocao getById(Integer id) {
		return adocaoDao.getById(id);
	}
	
	
	
	
}

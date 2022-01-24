package br.ifpe.web3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ifpe.web3.dao.UsuarioDAO;
import br.ifpe.web3.modelCadastro.Usuario;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioDAO usuariodao;

	public <S extends Usuario> S save(S entity) {
		return usuariodao.save(entity);
	}

	public List<Usuario> findAll() {
		return usuariodao.findAll();
	}

	public Optional<Usuario> findById(Integer id) {
		return usuariodao.findById(id);
	}

	public boolean existsById(Integer id) {
		return usuariodao.existsById(id);
	}

	public long count() {
		return usuariodao.count();
	}

	public void deleteById(Integer id) {
		usuariodao.deleteById(id);
	}
	
	
	
}

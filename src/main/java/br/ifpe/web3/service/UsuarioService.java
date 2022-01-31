package br.ifpe.web3.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ifpe.web3.util.Util;
import br.ifpe.web3.acesso.Perfil;
import br.ifpe.web3.acesso.SituacaoUsuario;
import br.ifpe.web3.util.ServiceException;
import br.ifpe.web3.dao.UsuarioDAO;
import br.ifpe.web3.modelCadastro.Usuario;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioDAO usuariodao;

	
	public void criarUsuarioAdmin() {
		Usuario usuario = new Usuario();
		usuario.setAtivo(true);
		usuario.setLogin("admin");
		usuario.setSenha("adm123");
		usuario.setPerfil(Perfil.ADMINISTRADOR);
		usuario.setNome("Administrador");
		usuario.setSituacaoUsuario(SituacaoUsuario.ATIVO);
		
		
		try {
			inserirUsuario(usuario);
		} catch (ServiceException e) {
			System.out.println("Usuário admin já existe");
		}
	}
	
	
	public void inserirUsuario(Usuario usuario) throws ServiceException {
		usuario.setSenha(util.md5(usuario.getSenha()));
		usuario.setDataCriacao(new Date());
		if (this.usuariodao.existsByLogin(usuario.getLogin()) == false) {
			this.usuariodao.save(usuario);
		} else {
			throw new ServiceException("Já existe usuário com este login");
		}
	}

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

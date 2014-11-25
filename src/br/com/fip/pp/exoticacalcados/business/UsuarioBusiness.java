package br.com.fip.pp.exoticacalcados.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.fip.pp.exoticacalcados.dao.UsuarioDao;
import br.com.fip.pp.exoticacalcados.entidades.Usuario;
import br.com.fip.pp.exoticacalcados.repositorio.Repositorio;

public class UsuarioBusiness implements Serializable, Repositorio<Usuario> {
	private List<Usuario> listaUsuario = new ArrayList<Usuario>();
	private UsuarioDao usuarioDao = new UsuarioDao();
	private static Logger LOGGER = LogManager.getLogger(UsuarioBusiness.class);
	private static Logger LOGGER_PADRAO = LogManager.getRootLogger();

	public UsuarioBusiness() {
		usuarioDao = new UsuarioDao();
	}

	@Override
	public void salvar(Usuario usuario) {

		usuarioDao.openSession();
		usuarioDao.salvar(usuario);
		usuarioDao.closedSession();
		LOGGER.debug("Usuario a ser cadastrado " + usuario.getNome());
		LOGGER.info("cadastrardo com sucesso");
		LOGGER_PADRAO.info("Salvo com sucesso");
	}

	@Override
	public void alterar(Usuario usuario) {
		usuarioDao.openSession();
		usuarioDao.alterar(usuario);
		usuarioDao.alterar(usuario);
	}

	@Override
	public void deletar(Usuario usuario) {
		usuarioDao.openSession();
		usuarioDao.deletar(usuario);
		usuarioDao.deletar(usuario);
	}

	@Override
	public List<Usuario> listar() {
		usuarioDao.openSession();
		this.listaUsuario = usuarioDao.listar();
		usuarioDao.closedSession();
		return listaUsuario;
	}

}

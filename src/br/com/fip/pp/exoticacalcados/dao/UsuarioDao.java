package br.com.fip.pp.exoticacalcados.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.fip.pp.exoticacalcados.entidades.Usuario;
import br.com.fip.pp.exoticacalcados.repositorio.Repositorio;

public class UsuarioDao extends GenericDAO<Usuario> implements Serializable,
		Repositorio<Usuario> {

	public UsuarioDao() {
		super(Usuario.class);
	}

}

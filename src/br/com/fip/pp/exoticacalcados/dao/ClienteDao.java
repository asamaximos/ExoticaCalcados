package br.com.fip.pp.exoticacalcados.dao;

import java.io.Serializable;

import br.com.fip.pp.exoticacalcados.entidades.Cliente;
import br.com.fip.pp.exoticacalcados.repositorio.ClienteRepositorio;

public class ClienteDao extends GenericDAO<Cliente> implements Serializable,
		ClienteRepositorio {

	public ClienteDao() {
		super(Cliente.class);
	}

}

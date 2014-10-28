package br.com.fip.pp.exoticacalcados.dao;

import java.io.Serializable;

import br.com.fip.pp.exoticacalcados.entidades.Cliente;

public class ClienteDao extends GenericDAO<Cliente> implements Serializable {

	public ClienteDao() {
		super(Cliente.class);
	}

}

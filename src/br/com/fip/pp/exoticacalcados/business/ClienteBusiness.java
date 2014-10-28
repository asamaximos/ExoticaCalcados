package br.com.fip.pp.exoticacalcados.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.fip.pp.exoticacalcados.dao.ClienteDao;
import br.com.fip.pp.exoticacalcados.entidades.Cliente;
import br.com.fip.pp.exoticacalcados.repositorio.Repositorio;

public class ClienteBusiness implements Serializable, Repositorio<Cliente> {
	private ClienteDao clienteDao;
	private List<Cliente> listaClientes = new ArrayList<Cliente>();

	public ClienteBusiness() {
		clienteDao = new ClienteDao();
	}

	@Override
	public void salvar(Cliente cliente) {
		clienteDao.openSession();
		clienteDao.salvar(cliente);
		clienteDao.closedSession();
	}

	@Override
	public void alterar(Cliente cliente) {
		clienteDao.openSession();
		clienteDao.alterar(cliente);
		clienteDao.closedSession();
	}

	@Override
	public void deletar(Cliente cliente) {
		clienteDao.openSession();
		clienteDao.deletar(cliente);
		clienteDao.closedSession();
	}

	@Override
	public List<Cliente> listar() {
		clienteDao.openSession();
		listaClientes = clienteDao.listar();
		clienteDao.closedSession();
		return listaClientes;
	}

}

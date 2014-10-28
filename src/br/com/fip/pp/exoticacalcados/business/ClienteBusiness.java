package br.com.fip.pp.exoticacalcados.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.fip.pp.exoticacalcados.dao.ClienteDao;
import br.com.fip.pp.exoticacalcados.entidades.Cliente;
import br.com.fip.pp.exoticacalcados.repositorio.Repositorio;

public class ClienteBusiness implements Serializable, Repositorio<Cliente> {
	private ClienteDao clienteDao;
	private List<Cliente> listaClientes;

	public ClienteBusiness() {
		clienteDao = new ClienteDao();
	}

	@Override
	public void salvar(Cliente cliente) {
		clienteDao.salvar(cliente);

	}

	@Override
	public void alterar(Cliente cliente) {
		clienteDao.alterar(cliente);

	}

	@Override
	public void deletar(Cliente cliente) {
		clienteDao.deletar(cliente);

	}

	@Override
	public List<Cliente> listar() {
		listaClientes = clienteDao.listar();
		return listaClientes;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
	
	public void closeSession(){
		this.clienteDao.closeSession();
	}
	
	public void openSession(){
		this.clienteDao.openSession();
	}
	

}

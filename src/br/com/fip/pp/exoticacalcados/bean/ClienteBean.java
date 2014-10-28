package br.com.fip.pp.exoticacalcados.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.fip.pp.exoticacalcados.business.ClienteBusiness;
import br.com.fip.pp.exoticacalcados.entidades.Cliente;
import br.com.fip.pp.exoticacalcados.entidades.Pessoa;
import br.com.fip.pp.exoticacalcados.entidades.PessoaFisica;

@ManagedBean
@ViewScoped
public class ClienteBean implements Serializable {

	private Cliente cliente;
	private ClienteBusiness clienteBusiness;
	private List<Cliente> listaClientes;

	public ClienteBean() {
		clienteBusiness = new ClienteBusiness();
		cliente = new Cliente();
		cliente.setPessoaFisica(new PessoaFisica());
		cliente.getPessoaFisica().setPessoa(new Pessoa());
	}

	public void salvar() {
		clienteBusiness.salvar(cliente);
	}

	public void alterar() {
		clienteBusiness.alterar(cliente);
	}

	public void deletar() {
		clienteBusiness.deletar(cliente);
	}

	public List<Cliente> getListaClientes() {
		this.listaClientes = clienteBusiness.listar();
		return listaClientes;
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente
	 *            the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the clienteBusiness
	 */
	public ClienteBusiness getClienteBusiness() {
		return clienteBusiness;
	}

	/**
	 * @param clienteBusiness
	 *            the clienteBusiness to set
	 */
	public void setClienteBusiness(ClienteBusiness clienteBusiness) {
		this.clienteBusiness = clienteBusiness;
	}

	/**
	 * @param listaClientes
	 *            the listaClientes to set
	 */
	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

}

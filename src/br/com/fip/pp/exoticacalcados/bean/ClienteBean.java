package br.com.fip.pp.exoticacalcados.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import br.com.fip.pp.exoticacalcados.business.ClienteBusiness;
import br.com.fip.pp.exoticacalcados.entidades.Cliente;
import br.com.fip.pp.exoticacalcados.entidades.Pessoa;
import br.com.fip.pp.exoticacalcados.entidades.PessoaFisica;

@ManagedBean(name="ClienteBean")
@RequestScoped
public class ClienteBean {
	private Pessoa pessoa;
	private PessoaFisica pessoaFisica;
	private Cliente cliente;
	private ClienteBusiness clienteBusiness = new ClienteBusiness();
	private List<Cliente> listaClientes;

	public ClienteBean() {
		pessoa = new Pessoa();
		pessoaFisica = new PessoaFisica();
		pessoaFisica.setPessoa(pessoa);
		cliente = new Cliente();
		cliente.setPessoaFisica(pessoaFisica);
		
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public PessoaFisica getPessoaFisica() {
		return pessoaFisica;
	}

	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void salvarCliente() {
		this.clienteBusiness.openSession();
		clienteBusiness.salvar(cliente);
		this.clienteBusiness.closeSession();
	}
	public void alterar(){
		this.clienteBusiness.openSession();
		System.out.println(cliente);
		clienteBusiness.alterar(cliente);
		this.clienteBusiness.closeSession();
	}
	public void remover(){
		clienteBusiness.deletar(cliente);
	}



	public List<Cliente> getListaClientes() {
		this.clienteBusiness.openSession();
		this.listaClientes = clienteBusiness.listar();
		this.clienteBusiness.closeSession();
		return listaClientes;
	}
}

package br.com.fip.pp.exoticacalcados.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.FlowEvent;

import br.com.fip.pp.exoticacalcados.business.ClienteBusiness;
import br.com.fip.pp.exoticacalcados.entidades.Cliente;
import br.com.fip.pp.exoticacalcados.entidades.Contato;
import br.com.fip.pp.exoticacalcados.entidades.Endereco;
import br.com.fip.pp.exoticacalcados.entidades.Pessoa;
import br.com.fip.pp.exoticacalcados.entidades.PessoaFisica;

/**
 * 
 * Classe de controle de Clientes para a interface gráfica.
 * 
 * @author Michel
 */
@ManagedBean
@SessionScoped
public class ClienteBean implements Serializable {

	private Cliente cliente;
	private ClienteBusiness clienteBusiness;
	private List<Cliente> listaClientes;
	private PessoaFisica pessoaFisica;
	private Contato contato;
	private Endereco endereco;

	/**
	 * O construtor da classe ClienteBean
	 */
	public ClienteBean() {
		clienteBusiness = new ClienteBusiness();
		cliente = new Cliente();
		contato = new Contato();
		endereco = new Endereco();
		pessoaFisica = new PessoaFisica();
		pessoaFisica.setPessoa(new Pessoa());
	}

	/**
	 * Método utilizado para salvar um Cliente
	 * 
	 * @see ClienteBusiness#salvar(Cliente)
	 */
	public void salvar() {
		pessoaFisica.getPessoa().setContato(contato);
		pessoaFisica.getPessoa().setEndereco(endereco);
		cliente.setPessoaFisica(pessoaFisica);
		clienteBusiness.salvar(cliente);
	}

	/**
	 * Método utilizado para alterar um Cliente
	 * 
	 * @see ClienteBusiness#alterar(Cliente)
	 */
	public void alterar() {
		clienteBusiness.alterar(cliente);
	}

	/**
	 * Método utilizado para deletar um Cliente
	 * 
	 * @see ClienteBusiness#deletar(Cliente)
	 */
	public void deletar() {
		clienteBusiness.deletar(cliente);
	}

	/**
	 * Método utilizado para listar Clientes
	 * 
	 * @return listaClientes
	 * @see ClienteBusiness#salvar(Cliente)
	 */
	public List<Cliente> getListaClientes() {
		this.listaClientes = clienteBusiness.listar();
		return listaClientes;
	}

	/**
	 * Método ultilizado para capturar um cliente
	 * @return um cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * Define um cliente para a variável
	 * 
	 * @param cliente
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * Método ultilizado para capturar uma pessoaFisica
	 * @return uma pessoaFisica
	 */
	public PessoaFisica getPessoaFisica() {
		return pessoaFisica;
	}

	/**
	 * Define uma pessoaFisica para a variável
	 * 
	 * @param pessoaFisica
	 */
	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}

	/**
	 * Método ultilizado para capturar um contato
	 * @return um contato
	 */
	public Contato getContato() {
		return contato;
	}

	/**
	 * Define um contato para a variável
	 * 
	 * @param contato
	 */
	public void setContato(Contato contato) {
		this.contato = contato;
	}

	/**
	 * Método ultilizado para capturar um endereço
	 * @return um endereco
	 */
	public Endereco getEndereco() {
		return endereco;
	}

	/**
	 * Define um endereço para a variável
	 * 
	 * @param endereco
	 */
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String onFlowProcess(FlowEvent event) {

		return event.getNewStep();
	}

	
}

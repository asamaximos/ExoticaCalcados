package br.com.fip.pp.exoticacalcados.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.primefaces.event.FlowEvent;

import br.com.fip.pp.exoticacalcados.business.ClienteBusiness;
import br.com.fip.pp.exoticacalcados.entidades.Cliente;
import br.com.fip.pp.exoticacalcados.entidades.Contato;
import br.com.fip.pp.exoticacalcados.entidades.Endereco;
import br.com.fip.pp.exoticacalcados.entidades.Pessoa;
import br.com.fip.pp.exoticacalcados.entidades.PessoaFisica;

@ManagedBean
@ViewScoped
public class ClienteBean implements Serializable {

	private Cliente cliente;
	private ClienteBusiness clienteBusiness;
	private List<Cliente> listaClientes;
	private PessoaFisica pessoaFisica;
	private Contato contato;
	private Endereco endereco;

	public ClienteBean() {
		clienteBusiness = new ClienteBusiness();
		cliente = new Cliente();
		pessoaFisica = new PessoaFisica();
		pessoaFisica.setPessoa(new Pessoa());
		contato = new Contato();
		endereco = new Endereco();
	}

	/**
	 * @param Salva
	 *            o cliente no banco
	 */

	public void salvar() {
		pessoaFisica.getPessoa().setContato(contato);
		pessoaFisica.getPessoa().setEndereco(endereco);
		cliente.setPessoaFisica(pessoaFisica);
		clienteBusiness.salvar(cliente);
	}

	/**
	 * @param Altera
	 *            o cliente no banco
	 */

	public void alterar() {
		clienteBusiness.alterar(cliente);
	}

	/**
	 * @param Remove
	 *            o cliente do banco
	 */

	public void deletar() {
		clienteBusiness.deletar(cliente);
	}

	/**
	 * @param Busca
	 *            os clientes do banco
	 * @return Lista de clientes do banco
	 */

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
	 * @return the pessoaFisica
	 */
	public PessoaFisica getPessoaFisica() {
		return pessoaFisica;
	}

	/**
	 * @param pessoaFisica the pessoaFisica to set
	 */
	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}

	/**
	 * @return the contato
	 */
	public Contato getContato() {
		return contato;
	}

	/**
	 * @param contato the contato to set
	 */
	public void setContato(Contato contato) {
		this.contato = contato;
	}

	/**
	 * @return the endereco
	 */
	public Endereco getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String onFlowProcess(FlowEvent event) {
		
        return event.getNewStep();
    }

	

}

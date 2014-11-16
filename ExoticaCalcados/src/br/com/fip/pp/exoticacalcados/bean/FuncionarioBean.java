package br.com.fip.pp.exoticacalcados.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.FlowEvent;

import br.com.fip.pp.exoticacalcados.business.FuncionarioBusiness;
import br.com.fip.pp.exoticacalcados.entidades.Contato;
import br.com.fip.pp.exoticacalcados.entidades.Endereco;
import br.com.fip.pp.exoticacalcados.entidades.Funcionario;
import br.com.fip.pp.exoticacalcados.entidades.Pessoa;
import br.com.fip.pp.exoticacalcados.entidades.PessoaFisica;

@ManagedBean
@ViewScoped
public class FuncionarioBean implements Serializable {
	private Funcionario funcionario;
	private FuncionarioBusiness funcionarioBusiness;
	private List<Funcionario> listaFuncionarios;
	private PessoaFisica pessoaFisica;
	private Endereco endereco;
	private Contato contato;
	

	public FuncionarioBean() {
		funcionarioBusiness = new FuncionarioBusiness();
		funcionario = new Funcionario();
		contato = new Contato();
		endereco = new Endereco();
		pessoaFisica = new PessoaFisica();
		pessoaFisica.setPessoa(new Pessoa());
		
	}

	public void salvar() {
		pessoaFisica.getPessoa().setContato(contato);
		pessoaFisica.getPessoa().setEndereco(endereco);
		funcionario.setPessoaFisica(pessoaFisica);
		funcionarioBusiness.salvar(funcionario);
	}

	public void alterar() {
		funcionarioBusiness.alterar(funcionario);
	}

	public void deletar() {
		funcionarioBusiness.deletar(funcionario);
	}

	/**
	 * @return the listaFuncionarios
	 */
	public List<Funcionario> getListaFuncionarios() {
		this.listaFuncionarios = funcionarioBusiness.listar();
		return listaFuncionarios;
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
	 * @return the endereco
	 */
	public Endereco getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco
	 *            the endereco to set
	 */
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	/**
	 * @return the contato
	 */
	public Contato getContato() {
		return contato;
	}

	/**
	 * @param contato
	 *            the contato to set
	 */
	public void setContato(Contato contato) {
		this.contato = contato;
	}

	/**
	 * @return the funcionario
	 */
	public Funcionario getFuncionario() {
		return funcionario;
	}

	/**
	 * @param funcionario
	 *            the funcionario to set
	 */
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	/**
	 * @return the funcionarioBusiness
	 */
	public FuncionarioBusiness getFuncionarioBusiness() {
		return funcionarioBusiness;
	}

	/**
	 * @param funcionarioBusiness
	 *            the funcionarioBusiness to set
	 */
	public void setFuncionarioBusiness(FuncionarioBusiness funcionarioBusiness) {
		this.funcionarioBusiness = funcionarioBusiness;
	}

	/**
	 * @param listaFuncionarios
	 *            the listaFuncionarios to set
	 */
	public void setListaFuncionarios(List<Funcionario> listaFuncionarios) {
		this.listaFuncionarios = listaFuncionarios;
	}

	public String onFlowProcess(FlowEvent event) {

		return event.getNewStep();
	}

}

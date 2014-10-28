package br.com.fip.pp.exoticacalcados.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.fip.pp.exoticacalcados.business.FuncionarioBusiness;
import br.com.fip.pp.exoticacalcados.entidades.Funcionario;
import br.com.fip.pp.exoticacalcados.entidades.Pessoa;
import br.com.fip.pp.exoticacalcados.entidades.PessoaFisica;

@ManagedBean
@ViewScoped
public class FuncionarioBean implements Serializable {
	private Funcionario funcionario;
	private FuncionarioBusiness funcionarioBusiness;
	private List<Funcionario> listaFuncionarios;

	public FuncionarioBean() {
		funcionarioBusiness = new FuncionarioBusiness();
		funcionario = new Funcionario();
		funcionario.setPessoaFisica(new PessoaFisica());
		funcionario.getPessoaFisica().setPessoa(new Pessoa());
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

	/**
	 * @return the listaFuncionarios
	 */
	public List<Funcionario> getListaFuncionarios() {
		listaFuncionarios = funcionarioBusiness.listar();
		return listaFuncionarios;
	}

	public void salvar() {
		funcionarioBusiness.salvar(funcionario);
	}

	public void alterar() {
		funcionarioBusiness.alterar(funcionario);
	}

	public void deletar() {
		funcionarioBusiness.deletar(funcionario);
	}

}

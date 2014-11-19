package br.com.fip.pp.exoticacalcados.bean;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.FlowEvent;

import br.com.fip.pp.exoticacalcados.business.ClienteBusiness;
import br.com.fip.pp.exoticacalcados.business.FuncionarioBusiness;
import br.com.fip.pp.exoticacalcados.entidades.Cliente;
import br.com.fip.pp.exoticacalcados.entidades.Contato;
import br.com.fip.pp.exoticacalcados.entidades.Endereco;
import br.com.fip.pp.exoticacalcados.entidades.Funcionario;
import br.com.fip.pp.exoticacalcados.entidades.Pessoa;
import br.com.fip.pp.exoticacalcados.entidades.PessoaFisica;

/**
 * Classe de controle de Funcionários para a interface gráfica.
 * 
 * @author Michel
 *
 */
@ManagedBean
@ViewScoped
public class FuncionarioBean implements Serializable {
	private Funcionario funcionario;
	private FuncionarioBusiness funcionarioBusiness;
	private List<Funcionario> listaFuncionarios;
	private PessoaFisica pessoaFisica;
	private Endereco endereco;
	private Contato contato;
	private Date dataAdmissao;

	/**
	 * Construtor da classe FuncionarioBean
	 */
	public FuncionarioBean() {
		funcionarioBusiness = new FuncionarioBusiness();
		funcionario = new Funcionario();
		contato = new Contato();
		endereco = new Endereco();
		pessoaFisica = new PessoaFisica();
		pessoaFisica.setPessoa(new Pessoa());
		this.dataAdmissao = new Date(funcionario.getDataAdmissao().getTime());
	}

	/**
	 * Método utilizado para salvar um Funcionário
	 * 
	 * @see FuncionarioBusiness#salvar(Funcionario)
	 */
	public void salvar() {
		pessoaFisica.getPessoa().setContato(contato);
		pessoaFisica.getPessoa().setEndereco(endereco);
		funcionario.setPessoaFisica(pessoaFisica);
		funcionario.setDataAdmissao(dataAdmissao);
		funcionarioBusiness.salvar(funcionario);
	}

	/**
	 * Método utilizado para alterar um Funcionário
	 * 
	 * @see FuncionarioBusiness#alterar(Funcionario)
	 */
	public void alterar() {
		funcionarioBusiness.alterar(funcionario);
	}

	/**
	 * Método utilizado para deletar um Funcionário
	 * 
	 * @see FuncionarioBusiness#deletar(Funcionario)
	 */
	public void deletar() {
		funcionarioBusiness.deletar(funcionario);
	}

	/**
	 * Método utilizado para listar funcionários
	 * 
	 * @return listaFuncionarios
	 * @see FuncionarioBusiness#listar()
	 */
	public List<Funcionario> getListaFuncionarios() {
		this.listaFuncionarios = funcionarioBusiness.listar();
		return listaFuncionarios;
	}

	/**
	 * Método ultilizado para capturar uma pessoaFisica
	 * 
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
	 * Método ultilizado para capturar um endereço
	 * 
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

	/**
	 * Método ultilizado para capturar um contato
	 * 
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
	 * Método ultilizado para capturar um funcionario
	 * 
	 * @return um funcionario
	 */
	public Funcionario getFuncionario() {
		return funcionario;
	}

	/**
	 * Define um funcionario para a variável
	 * 
	 * @param funcionario
	 */
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	/**
	 * Método ultilizado para capturar um funcionarioBusiness
	 * 
	 * @return um funcionarioBusiness
	 */
	public FuncionarioBusiness getFuncionarioBusiness() {
		return funcionarioBusiness;
	}

	/**
	 * Define um funcionarioBusiness para a variável
	 * 
	 * @param funcionarioBusiness
	 */
	public void setFuncionarioBusiness(FuncionarioBusiness funcionarioBusiness) {
		this.funcionarioBusiness = funcionarioBusiness;
	}

	public String onFlowProcess(FlowEvent event) {

		return event.getNewStep();
	}

}

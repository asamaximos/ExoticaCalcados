package br.com.fip.pp.exoticacalcados.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.fip.pp.exoticacalcados.business.PessoaFisicaBusiness;
import br.com.fip.pp.exoticacalcados.entidades.Pessoa;
import br.com.fip.pp.exoticacalcados.entidades.PessoaFisica;

@ManagedBean
@ViewScoped
public class PessoaFisicaBean {
	private Pessoa pessoa;
	private PessoaFisica pessoaFisica;
	private PessoaFisicaBusiness pessoaFisicaBusiness;
	private List<PessoaFisica> listaPessoaFisica = new ArrayList<PessoaFisica>();

	public PessoaFisicaBean() {
		pessoa = new Pessoa();
		pessoaFisica = new PessoaFisica();
		pessoaFisica.setPessoa(pessoa);
		pessoaFisicaBusiness = new PessoaFisicaBusiness();
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

	public void cadastarPessoaFisica() {
		pessoaFisicaBusiness.salvar(pessoaFisica);
	}

	public PessoaFisicaBusiness getPessoaFisicaBusiness() {
		return pessoaFisicaBusiness;
	}

	public void setPessoaFisicaBusiness(PessoaFisicaBusiness pessoaFisicaBusiness) {
		this.pessoaFisicaBusiness = pessoaFisicaBusiness;
	}

	public List<PessoaFisica> getListaPessoaFisica() {
		listaPessoaFisica = pessoaFisicaBusiness.listar();
		return listaPessoaFisica;
	}

	public void setListaPessoaFisica(List<PessoaFisica> listaPessoaFisica) {
		this.listaPessoaFisica = listaPessoaFisica;
	}
		

}
package br.com.fip.pp.exoticacalcados.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.fip.pp.exoticacalcados.business.ProdutoBusiness;
import br.com.fip.pp.exoticacalcados.entidades.Produto;

@SessionScoped
@ManagedBean
public class ProdutoBean implements Serializable {
	private ProdutoBusiness produtoBusiness;
	private List<Produto> listaProdutos = new ArrayList<Produto>();
	private Produto produto;

	public ProdutoBean() {
		produtoBusiness = new ProdutoBusiness();
		produto = new Produto();
	}

	public ProdutoBusiness getProdutoBusiness() {
		return produtoBusiness;
	}

	public void setProdutoBusiness(ProdutoBusiness produtoBusiness) {
		this.produtoBusiness = produtoBusiness;
	}

	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public void salvar() {
		produtoBusiness.salvar(produto);

	}

	public void alterar() {
		produtoBusiness.alterar(produto);

	}

	public void deletar() {
		produtoBusiness.deletar(produto);

	}

	public List<Produto> listar() {
		listaProdutos = produtoBusiness.listar();
		return listaProdutos;
	}

}

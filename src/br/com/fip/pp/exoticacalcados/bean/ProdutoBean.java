package br.com.fip.pp.exoticacalcados.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.fip.pp.exoticacalcados.business.ProdutoBusiness;
import br.com.fip.pp.exoticacalcados.entidades.Produto;

/**
 * Classe de controle de Produtos para a interface gr�fica.
 * 
 * @author Michel
 *
 */
@SessionScoped
@ManagedBean
public class ProdutoBean implements Serializable {
	private ProdutoBusiness produtoBusiness;
	private List<Produto> listaProdutos = new ArrayList<Produto>();
	private Produto produto;

	/**
	 * construtor da classe ProdutoBean
	 */
	public ProdutoBean() {
		produtoBusiness = new ProdutoBusiness();
		produto = new Produto();
	}

	/**
	 * M�todo ultilizado para capturar um produtoBusiness
	 * 
	 * @return produtoBusiness
	 */
	public ProdutoBusiness getProdutoBusiness() {
		return produtoBusiness;
	}

	/**
	 * Define um produtoBusiness para a vari�vel
	 * 
	 * @param produtoBusiness
	 */
	public void setProdutoBusiness(ProdutoBusiness produtoBusiness) {
		this.produtoBusiness = produtoBusiness;
	}

	/**
	 * M�todo ultilizado para lsitar produtos
	 * 
	 * @return listaProdutos
	 */
	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}

	/**
	 * M�todo ultilizado para capturar um produto
	 * 
	 * @return produtoBusiness
	 */
	public Produto getProduto() {
		return produto;
	}

	/**
	 * Define um produto para a vari�vel
	 * 
	 * @param produto
	 */
	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	/**
	 * M�todo utilizado para salvar um produto
	 * 
	 * @see ProdutoBusiness#salvar(Produto)
	 */
	public void salvar() {
		produtoBusiness.salvar(produto);

	}

	/**
	 * M�todo utilizado para alterar um produto
	 * 
	 * @see ProdutoBusiness#alterar(Produto)
	 */
	public void alterar() {
		produtoBusiness.alterar(produto);

	}

	/**
	 * M�todo utilizado para deletar um produto
	 * 
	 * @see ProdutoBusiness#deletar(Produto)
	 */
	public void deletar() {
		produtoBusiness.deletar(produto);

	}

	/**
	 * M�todo utilizado para listar produtos
	 * 
	 * @see ProdutoBusiness#listar()
	 */
	public List<Produto> listar() {
		listaProdutos = produtoBusiness.listar();
		return listaProdutos;
	}

}

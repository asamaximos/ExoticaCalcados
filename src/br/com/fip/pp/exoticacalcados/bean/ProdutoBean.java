package br.com.fip.pp.exoticacalcados.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.FlowEvent;

import br.com.fip.pp.exoticacalcados.business.ProdutoBusiness;
import br.com.fip.pp.exoticacalcados.entidades.Produto;


/**
 * Classe de controle de Produtos para a interface gráfica.
 * 
 * @author Michel
 *
 */

@ManagedBean
@ViewScoped
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
<<<<<<< HEAD
=======
	}

	/**
	 * Método ultilizado para capturar um produtoBusiness
	 * 
	 * @return produtoBusiness
	 */
	public ProdutoBusiness getProdutoBusiness() {
		return produtoBusiness;
	}

	/**
	 * Define um produtoBusiness para a variável
	 * 
	 * @param produtoBusiness
	 */
	public void setProdutoBusiness(ProdutoBusiness produtoBusiness) {
		this.produtoBusiness = produtoBusiness;
	}

	/**
	 * Método ultilizado para lsitar produtos
	 * 
	 * @return listaProdutos
	 */
	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}

	/**
	 * Método ultilizado para capturar um produto
	 * 
	 * @return produtoBusiness
	 */
	public Produto getProduto() {
		return produto;
	}

	/**
	 * Define um produto para a variável
	 * 
	 * @param produto
	 */
	public void setProduto(Produto produto) {
		this.produto = produto;
>>>>>>> branch 'master' of git@github.com:asamaximos/ExoticaCalcados.git
	}

	/**
	 * Método utilizado para salvar um produto
	 * 
	 * @see ProdutoBusiness#salvar(Produto)
	 */
	public void salvar() {
		produtoBusiness.salvar(produto);

	}

	/**
	 * Método utilizado para alterar um produto
	 * 
	 * @see ProdutoBusiness#alterar(Produto)
	 */
	public void alterar() {
		produtoBusiness.alterar(produto);

	}

	/**
	 * Método utilizado para deletar um produto
	 * 
	 * @see ProdutoBusiness#deletar(Produto)
	 */
	public void deletar() {
		produtoBusiness.deletar(produto);

	}

<<<<<<< HEAD
	public List<Produto> getListaProdutos() {
		this.listaProdutos = produtoBusiness.listar();
=======
	/**
	 * Método utilizado para listar produtos
	 * 
	 * @see ProdutoBusiness#listar()
	 */
	public List<Produto> listar() {
		listaProdutos = produtoBusiness.listar();
>>>>>>> branch 'master' of git@github.com:asamaximos/ExoticaCalcados.git
		return listaProdutos;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public String onFlowProcess(FlowEvent event) {

		return event.getNewStep();
	}

}

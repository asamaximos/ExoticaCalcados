package br.com.fip.pp.exoticacalcados.business;

import java.io.Serializable;
import java.util.List;

import br.com.fip.pp.exoticacalcados.dao.ClienteDao;
import br.com.fip.pp.exoticacalcados.dao.ProdutoDao;
import br.com.fip.pp.exoticacalcados.entidades.Cliente;
import br.com.fip.pp.exoticacalcados.entidades.Produto;
import br.com.fip.pp.exoticacalcados.repositorio.Repositorio;

/**
 * Classe responsável pelas chamadas dos métodos da classe ProdutoDao
 * 
 * @author Michel
 *
 */
public class ProdutoBusiness implements Serializable, Repositorio<Produto> {
	private ProdutoDao produtoDao;
	private List<Produto> listaProduto;
	private Produto produto;

	/**
	 * Construtor da classe ProdutoBusiness
	 */
	public ProdutoBusiness() {
		produtoDao = new ProdutoDao();
		produto = new Produto();
	}

	/**
	 * Método responsável pela chamada do método salvar da camada DAO
	 * 
	 * @see ProdutoDao#salvar(Produto)
	 */
	public void salvar(Produto objeto) {
		produtoDao.salvar(produto);

	}

	/**
	 * Método responsável pela chamada do método alterar da camada DAO
	 * 
	 * @see ProdutoDao#alterar(Produto)
	 */
	public void alterar(Produto objeto) {
		produtoDao.salvar(produto);

	}

	/**
	 * Método responsável pela chamada do método deletar da camada DAO
	 * 
	 * @see ProdutoDao#deletar(Produto)
	 */
	public void deletar(Produto objeto) {
		produtoDao.deletar(objeto);

	}

	/**
	 * Método responsável pela chamada do método listar da camada DAO
	 * 
	 * @see ProdutoDao#listar()
	 */
	public List<Produto> listar() {
		listaProduto = produtoDao.listar();
		return listaProduto;
	}

}

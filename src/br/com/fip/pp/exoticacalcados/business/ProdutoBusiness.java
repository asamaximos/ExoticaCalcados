package br.com.fip.pp.exoticacalcados.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.fip.pp.exoticacalcados.dao.ClienteDao;
import br.com.fip.pp.exoticacalcados.dao.ProdutoDao;
import br.com.fip.pp.exoticacalcados.entidades.Cliente;
import br.com.fip.pp.exoticacalcados.entidades.Produto;
import br.com.fip.pp.exoticacalcados.repositorio.Repositorio;

/**

 * Classe Reponsavel
 * 
 * @author LuizNeto
 *
 */

public class ProdutoBusiness implements Serializable, Repositorio<Produto> {
	private ProdutoDao produtoDao;
	private List<Produto> listaProduto = new ArrayList<Produto>();
	private static final Logger LOGGER = LogManager
			.getLogger(ProdutoBusiness.class);
	private static final Logger LOGGER_PADRAO = LogManager.getRootLogger();

	/**
	 * Construtor da classe ProdutoBusiness
	 */
	public ProdutoBusiness() {
		produtoDao = new ProdutoDao();
	}

	/**

	 * metodo reponsavel por salvar um objeto do tipo Produto
	 */
	@Override
	public void salvar(Produto produto) {
		produtoDao.openSession();
		/**
	 * M�todo respons�vel pela chamada do m�todo salvar da camada DAO
	 * 
	 * @see ProdutoDao#salvar(Produto)
	 */
	public void salvar(Produto objeto) {

		produtoDao.salvar(produto);
		produtoDao.closedSession();
		LOGGER.debug("Produto a ser Salvo " + produto.getCodigo());
		LOGGER.info("Salvo Com Sucesso");
		LOGGER_PADRAO.info("Produto cadastrado com sucesso");
	}

	/**
	 * metodo reponsavel por alterar um objeto do tipo Produto
	 */

	@Override
	public void alterar(Produto produto) {

		produtoDao.openSession();
		produtoDao.alterar(produto);
		produtoDao.closedSession();
		LOGGER.debug("Produto a ser Alterado" + produto.getCodigo());
		LOGGER.info("Alterado Com Sucesso");
		LOGGER_PADRAO.info("Produto Alterado com sucesso");

	}

	/**
	 * metodo reponsavel por deletar um objeto do tipo Produto
	 *
	 * 
	 * @see ProdutoDao#alterar(Produto)
	 */
	public void alterar(Produto objeto) {
		produtoDao.salvar(produto);

	}

	@Override
	public void deletar(Produto produto) {

		produtoDao.openSession();
		produtoDao.deletar(produto);
		produtoDao.closedSession();
		LOGGER.debug("Produto a ser Excluido "+ produto.getCodigo());
		LOGGER.info("Excluido Com Sucesso");
		LOGGER_PADRAO.info("Produto Excluido com sucesso");

	/**
	 * M�todo respons�vel pela chamada do m�todo deletar da camada DAO
	 * 
	 * @see ProdutoDao#deletar(Produto)
	 */
	public void deletar(Produto objeto) {
		produtoDao.deletar(objeto);


	}

	/**
	 * M�todo respons�vel pela chamada do m�todo listar da camada DAO
	 * 
	 * @see ProdutoDao#listar()
	 */
	public List<Produto> listar() {
		produtoDao.openSession();
		listaProduto = produtoDao.listar();
		produtoDao.closedSession();
		return listaProduto;
	}

}

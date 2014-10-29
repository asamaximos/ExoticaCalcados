package br.com.fip.pp.exoticacalcados.business;

import java.io.Serializable;
import java.util.List;

import br.com.fip.pp.exoticacalcados.dao.ProdutoDao;
import br.com.fip.pp.exoticacalcados.entidades.Produto;
import br.com.fip.pp.exoticacalcados.repositorio.Repositorio;

public class ProdutoBusiness implements Serializable, Repositorio<Produto> {
	private ProdutoDao produtoDao;
	private List<Produto> listaProduto;
	private Produto produto;

	public ProdutoBusiness() {
		produtoDao = new ProdutoDao();
		produto = new Produto();
	}

	@Override
	public void salvar(Produto objeto) {
		produtoDao.salvar(produto);

	}

	@Override
	public void alterar(Produto objeto) {
		produtoDao.salvar(produto);

	}

	@Override
	public void deletar(Produto objeto) {
		produtoDao.deletar(objeto);

	}

	@Override
	public List<Produto> listar() {
		listaProduto = produtoDao.listar();
		return listaProduto;
	}

}

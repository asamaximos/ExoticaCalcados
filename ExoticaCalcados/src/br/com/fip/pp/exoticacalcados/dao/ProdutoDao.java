package br.com.fip.pp.exoticacalcados.dao;

import java.io.Serializable;

import br.com.fip.pp.exoticacalcados.entidades.Produto;
import br.com.fip.pp.exoticacalcados.repositorio.Repositorio;

public class ProdutoDao extends GenericDAO<Produto> implements Serializable,
		Repositorio<Produto> {

	public ProdutoDao() {
		super(Produto.class);
	}

}

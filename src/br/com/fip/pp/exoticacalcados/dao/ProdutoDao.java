package br.com.fip.pp.exoticacalcados.dao;

import java.io.Serializable;

import br.com.fip.pp.exoticacalcados.entidades.Produto;

public class ProdutoDao extends GenericDAO<Produto> implements Serializable {

	public ProdutoDao() {
		super(Produto.class);
	}

}

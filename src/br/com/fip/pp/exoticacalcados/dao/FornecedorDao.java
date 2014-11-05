package br.com.fip.pp.exoticacalcados.dao;

import java.io.Serializable;

import br.com.fip.pp.exoticacalcados.entidades.Fornecedor;
import br.com.fip.pp.exoticacalcados.repositorio.FornecedorRepositorio;

public class FornecedorDao extends GenericDAO<Fornecedor> implements Serializable, FornecedorRepositorio{

	public FornecedorDao() {
		super(Fornecedor.class);
	}

}

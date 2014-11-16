package br.com.fip.pp.exoticacalcados.dao;

import java.io.Serializable;

import br.com.fip.pp.exoticacalcados.entidades.Vendas;
import br.com.fip.pp.exoticacalcados.repositorio.VendasRepositorio;

public class VendaDao extends GenericDAO<Vendas> implements Serializable, VendasRepositorio{

	public VendaDao() {
		super(Vendas.class);
		// TODO Auto-generated constructor stub
	}

}

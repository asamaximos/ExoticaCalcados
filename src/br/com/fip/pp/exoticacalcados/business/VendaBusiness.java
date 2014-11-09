package br.com.fip.pp.exoticacalcados.business;

import java.io.Serializable;
import java.util.List;

import br.com.fip.pp.exoticacalcados.dao.VendaDao;
import br.com.fip.pp.exoticacalcados.entidades.Vendas;
import br.com.fip.pp.exoticacalcados.repositorio.Repositorio;

public class VendaBusiness implements Serializable, Repositorio<Vendas>{
	private VendaDao vendaDao;
	private List<Vendas> listaVendas;
	
	public VendaBusiness() {
		this.vendaDao = new VendaDao();
		
	}

	@Override
	public void salvar(Vendas venda) {
		this.vendaDao.openSession();
		this.vendaDao.salvar(venda);
		this.vendaDao.closedSession();
		
	}

	@Override
	public void alterar(Vendas venda) {
		this.vendaDao.openSession();
		this.vendaDao.alterar(venda);
		this.vendaDao.closedSession();
		
	}

	@Override
	public void deletar(Vendas venda) {
		this.vendaDao.openSession();
		this.vendaDao.deletar(venda);
		this.vendaDao.closedSession();
	}

	@Override
	public List<Vendas> listar() {
		this.vendaDao.openSession();
		this.listaVendas = vendaDao.listar();
		this.vendaDao.closedSession();
		
		return listaVendas;
	}
	

}

package br.com.fip.pp.exoticacalcados.business;

import java.io.Serializable;
import java.util.List;

import br.com.fip.pp.exoticacalcados.dao.ClienteDao;
import br.com.fip.pp.exoticacalcados.dao.VendaDao;
import br.com.fip.pp.exoticacalcados.entidades.Cliente;
import br.com.fip.pp.exoticacalcados.entidades.Vendas;
import br.com.fip.pp.exoticacalcados.repositorio.Repositorio;

/**
 * Classe responsável pelas chamadas dos métodos da classe VendaDao
 * 
 * @author Michel
 *
 */
public class VendaBusiness implements Serializable, Repositorio<Vendas> {
	private VendaDao vendaDao;
	private List<Vendas> listaVendas;

	/**
	 * Construtor da classe VendaBusiness
	 */
	public VendaBusiness() {
		this.vendaDao = new VendaDao();

	}

	/**
	 * Método responsável pela chamada do método salvar da camada DAO
	 * 
	 * @see VendaDao#salvar(Vendas)
	 */
	public void salvar(Vendas venda) {
		this.vendaDao.openSession();
		this.vendaDao.salvar(venda);
		this.vendaDao.closedSession();

	}

	/**
	 * Método responsável pela chamada do método alterar da camada DAO
	 * 
	 * @see VendaDao#alterar(Vendas)
	 */
	@Override
	public void alterar(Vendas venda) {
		this.vendaDao.openSession();
		this.vendaDao.alterar(venda);
		this.vendaDao.closedSession();

	}

	/**
	 * Método responsável pela chamada do método deletar da camada DAO
	 * 
	 * @see VendaDao#deletar(Vendas)
	 */
	public void deletar(Vendas venda) {
		this.vendaDao.openSession();
		this.vendaDao.deletar(venda);
		this.vendaDao.closedSession();
	}

	/**
	 * Método responsável pela chamada do método listar da camada DAO
	 * 
	 * @see VendaDao#listar()
	 */
	public List<Vendas> listar() {
		this.vendaDao.openSession();
		this.listaVendas = vendaDao.listar();
		this.vendaDao.closedSession();

		return listaVendas;
	}

}

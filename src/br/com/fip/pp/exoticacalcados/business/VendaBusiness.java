package br.com.fip.pp.exoticacalcados.business;

import java.io.Serializable;
import java.util.List;

import br.com.fip.pp.exoticacalcados.dao.ClienteDao;
import br.com.fip.pp.exoticacalcados.dao.VendaDao;
import br.com.fip.pp.exoticacalcados.entidades.Cliente;
import br.com.fip.pp.exoticacalcados.entidades.Vendas;
import br.com.fip.pp.exoticacalcados.repositorio.Repositorio;

/**
 * Classe respons�vel pelas chamadas dos m�todos da classe VendaDao
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
	 * M�todo respons�vel pela chamada do m�todo salvar da camada DAO
	 * 
	 * @see VendaDao#salvar(Vendas)
	 */
	public void salvar(Vendas venda) {
		this.vendaDao.openSession();
		this.vendaDao.salvar(venda);
		this.vendaDao.closedSession();

	}

	/**
	 * M�todo respons�vel pela chamada do m�todo alterar da camada DAO
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
	 * M�todo respons�vel pela chamada do m�todo deletar da camada DAO
	 * 
	 * @see VendaDao#deletar(Vendas)
	 */
	public void deletar(Vendas venda) {
		this.vendaDao.openSession();
		this.vendaDao.deletar(venda);
		this.vendaDao.closedSession();
	}

	/**
	 * M�todo respons�vel pela chamada do m�todo listar da camada DAO
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

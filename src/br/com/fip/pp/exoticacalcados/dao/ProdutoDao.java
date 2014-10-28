/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fip.pp.exoticacalcados.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.fip.pp.exoticacalcados.entidades.Produto;
import br.com.fip.pp.exoticacalcados.util.HibernateUtil;

/**
 *
 * @author Luiz
 * 
 */
public class ProdutoDao extends GenericDAO<Produto> implements Serializable {

	private Produto produto;
	private Session session;
	private Transaction trans;
	private List<Produto> listaProduto;

	public ProdutoDao() {
		super(Produto.class);
	}
	@Override
	/**
	 * 
	 */
	public List<Produto> listar() {
		try {
			this.session = HibernateUtil.getSessionFactory().openSession();
			this.trans = session.beginTransaction();

			Criteria cri = session.createCriteria(Produto.class);
			this.listaProduto = cri.list();

		} catch (HibernateException e) {
		} finally {
			session.close();
		}

		return listaProduto;
	}

}

package br.com.fip.pp.exoticacalcados.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.fip.pp.exoticacalcados.entidades.PessoaJuridica;
import br.com.fip.pp.exoticacalcados.repositorio.Repositorio;
import br.com.fip.pp.exoticacalcados.util.HibernateUtil;

public abstract class GenericDAO<T> implements Repositorio<T> {

	private Session session;
	private Transaction trans;
	private Class<T> classe;

	public GenericDAO(Class<T> classe) {
		this.classe = classe;
	}

	public void salvar(T classe) {
		try {
			this.trans = getCurrentSession().beginTransaction();
			getCurrentSession().save(classe);
			trans.commit();
		} catch (Exception e) {
			trans.rollback();

		} 

	}

	public void alterar(T classe) {
		try {
			this.trans = getCurrentSession().beginTransaction();
			getCurrentSession().update(classe);
			trans.commit();
		} catch (Exception e) {
			trans.rollback();
			e.printStackTrace();
		} 

	}

	public void deletar(T entity) {
		try {
			this.trans = getCurrentSession().beginTransaction();
			getCurrentSession().delete(entity);
			trans.commit();
		} catch (Exception e) {
			trans.rollback();
			e.printStackTrace();
		} 

	}

	@SuppressWarnings("unchecked")
	public List<T> listar() {
		List<T> lista = new ArrayList<T>();
		
		try {
			lista = getCurrentSession().createCriteria(classe).list();
		} catch (Exception e) {
			trans.rollback();
			e.printStackTrace();
		} 
		return lista;
		
	}

	public Session getCurrentSession() {
		return session;
	}
	public void openSession(){
		this.session = HibernateUtil.getSessionFactory().openSession();
	}
	public void closeSession(){
		this.session.close();
	}

}

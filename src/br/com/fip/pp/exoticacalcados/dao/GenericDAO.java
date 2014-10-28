package br.com.fip.pp.exoticacalcados.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.fip.pp.exoticacalcados.repositorio.Repositorio;
import br.com.fip.pp.exoticacalcados.util.HibernateUtil;

public abstract class GenericDAO<T> implements Repositorio<T> {

	private Session session;
	private Transaction trans;
	private List<T> lista = new ArrayList<T>();
	private Class<T> classe;

	public GenericDAO(Class<T> classe) {
		this.classe = classe;

	}

	public void salvar(T objeto) {
		try {
			this.trans = getCurrentSession().beginTransaction();
			getCurrentSession().save(objeto);
			trans.commit();
		} catch (Exception e) {
			trans.rollback();
			e.printStackTrace();
		}
	}

	public void openSession() {
		this.session = HibernateUtil.getSessionFactory().openSession();
	}

	public void closedSession() {
		getCurrentSession().close();
	}

	public void alterar(T entity) {
		try {
			this.trans = getCurrentSession().beginTransaction();
			getCurrentSession().update(entity);
			getCurrentSession().flush();
			trans.commit();
		} catch (Exception e) {
			trans.rollback();
			e.printStackTrace();
		}
	}

	public void deletar(T entity) {
		try {
			T novo = buscar(entity);
			this.trans = getCurrentSession().beginTransaction();
			getCurrentSession().delete(novo);
			trans.commit();
		} catch (Exception e) {
			trans.rollback();
			e.printStackTrace();
		}

	}

	public T buscar(T entity) {

		long id = entity.hashCode();
		for (T t : lista) {

			if (id == t.hashCode())
				entity = t;
		}
		return entity;
	}

	public List<T> listar() {
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

}

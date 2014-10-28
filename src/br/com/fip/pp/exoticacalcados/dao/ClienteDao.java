package br.com.fip.pp.exoticacalcados.dao;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.OneToOne;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.annotations.Cascade;

import br.com.fip.pp.exoticacalcados.entidades.Cliente;
import br.com.fip.pp.exoticacalcados.repositorio.Repositorio;
import br.com.fip.pp.exoticacalcados.util.HibernateUtil;

public class ClienteDao extends GenericDAO<Cliente> implements Serializable {

	public ClienteDao() {
		super(Cliente.class);
	}




}

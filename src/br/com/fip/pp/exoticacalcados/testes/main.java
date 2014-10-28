package br.com.fip.pp.exoticacalcados.testes;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.fip.pp.exoticacalcados.business.ClienteBusiness;
import br.com.fip.pp.exoticacalcados.entidades.Pessoa;
import br.com.fip.pp.exoticacalcados.util.HibernateUtil;

public class main {

	public static void main(String[] args) {
		 Session session = HibernateUtil.getSessionFactory().openSession();
		 Transaction trans = session.beginTransaction();
		// Pessoa pessoa = new Pessoa();
		// pessoa.setNome("teste2");
		// PessoaFisica pessoaFisica = new PessoaFisica();
		// pessoaFisica.setCpf("Teste2");
		// /pessoaFisica.setPessoa(pessoa);
		// Cliente cliente = new Cliente();
		// cliente.setPessoa(pessoa);
		// cliente.setPessoaFisica(pessoaFisica);
		// session.save(cliente);
		// trans.commit();
		ClienteBusiness cliente = new ClienteBusiness();
		List<Pessoa> teste = new ArrayList<Pessoa>();
		 Listar(session,trans);
	}


	
 public  static void Listar(Session session,Transaction trans){
		 
	try {
		List<Pessoa> lista = new  ArrayList<Pessoa>();

		trans = session.beginTransaction();

		Criteria cri = session.createCriteria(Object.class);
		lista = cri.list();
		ClienteBusiness cliente = new ClienteBusiness();
		List<Pessoa> teste = new ArrayList<Pessoa>();
	
		for (Pessoa c : teste) {
			System.out.println(c);
		}

	} catch (HibernateException e) {
		trans.rollback();
		e.printStackTrace();
	} finally {
		session.close();
	}


 }	
}


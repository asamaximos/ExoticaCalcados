package br.com.fip.pp.exoticacalcados.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.fip.pp.exoticacalcados.dao.FuncionarioDao;
import br.com.fip.pp.exoticacalcados.entidades.Funcionario;
import br.com.fip.pp.exoticacalcados.repositorio.Repositorio;

public class FuncionarioBusiness implements Serializable, Repositorio<Funcionario>{
	private FuncionarioDao FuncionarioDao;
	private List<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
	
	public FuncionarioBusiness() {
		FuncionarioDao = new FuncionarioDao();
	}
	@Override
	public void salvar(Funcionario objeto) {
		FuncionarioDao.openSession();
		FuncionarioDao.salvar(objeto);
		FuncionarioDao.closedSession();
		
	}

	@Override
	public void alterar(Funcionario objeto) {
		FuncionarioDao.openSession();
		FuncionarioDao.alterar(objeto);
		FuncionarioDao.closedSession();
	}

	@Override
	public void deletar(Funcionario objeto) {
		FuncionarioDao.openSession();
		FuncionarioDao.deletar(objeto);
		FuncionarioDao.closedSession();
	}

	@Override
	public List<Funcionario> listar() {
		FuncionarioDao.openSession();
		listaFuncionarios = FuncionarioDao.listar();
		FuncionarioDao.closedSession();
		return listaFuncionarios;
	}
	

}

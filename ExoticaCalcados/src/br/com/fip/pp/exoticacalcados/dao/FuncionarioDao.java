package br.com.fip.pp.exoticacalcados.dao;

import java.io.Serializable;

import br.com.fip.pp.exoticacalcados.entidades.Funcionario;
import br.com.fip.pp.exoticacalcados.repositorio.FuncionarioRepositorio;

public class FuncionarioDao extends GenericDAO<Funcionario> implements
		Serializable, FuncionarioRepositorio {

	public FuncionarioDao() {
		super(Funcionario.class);

	}

}

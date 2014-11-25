package br.com.fip.pp.exoticacalcados.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

=======
import br.com.fip.pp.exoticacalcados.dao.ClienteDao;
>>>>>>> branch 'master' of git@github.com:asamaximos/ExoticaCalcados.git
import br.com.fip.pp.exoticacalcados.dao.FuncionarioDao;
import br.com.fip.pp.exoticacalcados.entidades.Cliente;
import br.com.fip.pp.exoticacalcados.entidades.Funcionario;
import br.com.fip.pp.exoticacalcados.repositorio.Repositorio;

/**
 * Classe respons�vel pelas chamadas dos m�todos da classe FuncionarioDao
 * 
 * @author Michel
 *
 */
public class FuncionarioBusiness implements Serializable,
		Repositorio<Funcionario> {
	private FuncionarioDao FuncionarioDao;
	private List<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
	private static final Logger LOGGER = LogManager
			.getLogger(FuncionarioBusiness.class);
	private static final Logger LOGGER_PADRAO = LogManager.getRootLogger();

	/**
	 * Construtor da classe FuncionarioBusiness
	 */
	public FuncionarioBusiness() {
		FuncionarioDao = new FuncionarioDao();
	}

	/**
	 * M�todo respons�vel pela chamada do m�todo salvar da camada DAO
	 * 
	 * @see FuncionarioDao#salvar(Funcionario)
	 */
	public void salvar(Funcionario objeto) {
		FuncionarioDao.openSession();
		FuncionarioDao.salvar(objeto);
		FuncionarioDao.closedSession();
		LOGGER.debug("Funcioraio a ser Cadastrardo" + objeto.getPessoaFisica().getPessoa().getNome());
		LOGGER.info("Cadastrado  Com Sucesso");
		LOGGER_PADRAO.info("Funcionario Cadastrado com sucesso");

	}

	/**
	 * M�todo respons�vel pela chamada do m�todo alterar da camada DAO
	 * 
	 * @see FuncionarioDao#alterar(Funcionario)
	 */
	public void alterar(Funcionario objeto) {
		FuncionarioDao.openSession();
		FuncionarioDao.alterar(objeto);
		FuncionarioDao.closedSession();
		LOGGER.debug("Funcioraio a ser Alterado" + objeto.getPessoaFisica().getPessoa().getNome());
		LOGGER.info("Alterado Com Sucesso");
		LOGGER_PADRAO.info("Funcionario Alterado com sucesso");
	}

	/**
	 * M�todo respons�vel pela chamada do m�todo deletar da camada DAO
	 * 
	 * @see FuncionarioDao#deletar(Funcionario)
	 */
	public void deletar(Funcionario objeto) {
		FuncionarioDao.openSession();
		FuncionarioDao.deletar(objeto);
		FuncionarioDao.closedSession();
		LOGGER.debug("Funcioraio a ser Excluido" + objeto.getPessoaFisica().getPessoa().getNome());
		LOGGER.info("Excluido Com Sucesso");
		LOGGER_PADRAO.info("Funcionario Alterado com sucesso");
	}

	/**
	 * M�todo respons�vel pela chamada do m�todo listar da camada DAO
	 * 
	 * @see FuncionarioDao#listar()
	 */
	public List<Funcionario> listar() {
		FuncionarioDao.openSession();
		listaFuncionarios = FuncionarioDao.listar();
		FuncionarioDao.closedSession();
		return listaFuncionarios;
	}

}

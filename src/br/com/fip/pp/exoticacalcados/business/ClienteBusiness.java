package br.com.fip.pp.exoticacalcados.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.fip.pp.exoticacalcados.dao.ClienteDao;
import br.com.fip.pp.exoticacalcados.entidades.Cliente;
import br.com.fip.pp.exoticacalcados.repositorio.Repositorio;


/**
 * Classe responsável pelas chamadas dos métodos da classe ClienteDao
 * 
 * @author Michel
 *
 */
public class ClienteBusiness implements Serializable, Repositorio<Cliente> {
	private ClienteDao clienteDao;
	private List<Cliente> listaClientes = new ArrayList<Cliente>();
	private static Logger LOGGER = LogManager.getLogger(ClienteBusiness.class);
	private static Logger LOGGER_PADRAO = LogManager.getRootLogger();


	/**
	 * Construtor da classe ClienteBusiness
	 */
	public ClienteBusiness() {
		clienteDao = new ClienteDao();
	}

	/**
	 * Método responsável pela chamada do método salvar da camada DAO
	 * 
	 * @see ClienteDao#salvar(Cliente)
	 */
	public void salvar(Cliente cliente) {
		clienteDao.openSession();
		clienteDao.salvar(cliente);
		clienteDao.closedSession();
		LOGGER.debug("Cliente a ser Cadastrado "+ cliente.getPessoaFisica().getPessoa().getNome());
		LOGGER.info("cadastrado com sucesso");
		LOGGER_PADRAO.info("Cliente cadastrado com sucesso");
	}

	/**
	 * Método responsável pela chamada do método alterar da camada DAO
	 * 
	 * @see ClienteDao#alterar(Cliente)
	 */
	public void alterar(Cliente cliente) {
		clienteDao.openSession();
		clienteDao.alterar(cliente);
		clienteDao.closedSession();
		LOGGER.debug("Cliente a ser alterado "+ cliente.getPessoaFisica().getPessoa().getNome());
		LOGGER.info("Cliente Alterado com sucesso");
		LOGGER_PADRAO.info("Cliente alterado com sucesso");
	}

	/**
	 * Método responsável pela chamada do método deletar da camada DAO
	 * 
	 * @see ClienteDao#deletar(Cliente)
	 */
	public void deletar(Cliente cliente) {
		clienteDao.openSession();
		clienteDao.deletar(cliente);
		clienteDao.closedSession();
		LOGGER.debug("Cliente a ser Exculido "+ cliente.getPessoaFisica().getPessoa().getNome());
		LOGGER.info("Excluido com Sucessso");
		LOGGER_PADRAO.info("Cliente cadastrado com sucesso");
	}

	/**
	 * Método responsável pela chamada do método listar da camada DAO
	 * 
	 * @see ClienteDao#listar()
	 */
	public List<Cliente> listar() {
		clienteDao.openSession();
		listaClientes = clienteDao.listar();
		clienteDao.closedSession();
		return listaClientes;
	}

}

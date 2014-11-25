import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.junit.Test;

import br.com.fip.pp.exoticacalcados.business.FuncionarioBusiness;
import br.com.fip.pp.exoticacalcados.entidades.Contato;
import br.com.fip.pp.exoticacalcados.entidades.Endereco;
import br.com.fip.pp.exoticacalcados.entidades.Funcionario;
import br.com.fip.pp.exoticacalcados.entidades.Pessoa;
import br.com.fip.pp.exoticacalcados.entidades.PessoaFisica;

public class FuncionarioBusinessTeste {
	private Funcionario funcionario = new Funcionario();
	private List<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
	private Pessoa pessoa = new Pessoa();
	private PessoaFisica pessoaFisica = new PessoaFisica();
	private FuncionarioBusiness funcionarioBusiness = new FuncionarioBusiness();
	private Endereco endereco;
	private Contato contato;

	@Test
	public void TesteSeUmFuncionarioEstaSendoInserioNoBanco() {
		contato.setEmail("luizneto");
		endereco.setCidade("Cacimba de Areia");
		endereco.setComplemento("casa");
		pessoa.setNome("João Batista");
		pessoa.setContato(contato);
		pessoa.setEndereco(endereco);
		pessoaFisica.setCpf("10166359408");
		pessoaFisica.setPessoa(pessoa);
		funcionario.setCargo("vendedor");
		Calendar calendario;			
		funcionario.setSalario(720.00);
		funcionario.setDataAdmissao(Calendar.getInstance());
		funcionarioBusiness.salvar(funcionario);
		
	}
	
	@Test 
	public void TestSeumFuncionarioEstaSendoExcluidoNoBancoDeDados() {
		funcionarioBusiness.deletar(funcionario);
	}
	@Test
	public void TesteSeAListaEstaSendoPreenchida() {
		
		listaFuncionarios = funcionarioBusiness.listar();
	}
	@Test 
	public void TesteSeUmFuncionarioEstaSendoExcluidoComSucesssoNoBandoDeDados() {
		funcionarioBusiness.deletar(funcionario);
		
	}
}
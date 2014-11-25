import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.fip.pp.exoticacalcados.business.ClienteBusiness;
import br.com.fip.pp.exoticacalcados.entidades.Cliente;
import br.com.fip.pp.exoticacalcados.entidades.Contato;
import br.com.fip.pp.exoticacalcados.entidades.Endereco;
import br.com.fip.pp.exoticacalcados.entidades.Pessoa;
import br.com.fip.pp.exoticacalcados.entidades.PessoaFisica;

public class ClienteBusinessTeste {
	private List<Cliente> listaClientes = new ArrayList<Cliente>();
	private ClienteBusiness clienteBusiness = new ClienteBusiness();
	private Cliente cliente = new Cliente();
	private Pessoa pessoa = new Pessoa();
	private PessoaFisica pessoaFisica = new PessoaFisica();
	private Contato contato = new Contato();
	private Endereco endereco = new Endereco();

	@Test
	public void TesteSeUmCLienteEstaSendoInseridoNoBancoDeDados() {
		endereco.setBairro("Centro");
		endereco.setCep("58730000");
		endereco.setCidade("Cacimba de Areia");
		endereco.setComplemento("casa");
		endereco.setEstado("Pb");
		endereco.setNumero(05);
		endereco.setRua("Antonio Felix de Mendonça");
		contato.setEmail("Luizneto@ffm.com.br");
		contato.setTelefone1("81142547");
		contato.setWebSite("www.google.com");
		pessoa.setNome("luiz");
		pessoa.setContato(contato);
		pessoa.setEndereco(endereco);
		pessoaFisica.setCpf("10166359408");
		pessoaFisica.setIdade(21);
		pessoaFisica.setSexo('m');
		pessoaFisica.setPessoa(pessoa);
		cliente.setDebito(2222);
		cliente.setPessoaFisica(pessoaFisica);
		clienteBusiness.salvar(cliente);

	}
	@Test
	public void CapturaTodosOsCLientesExistentesNoBancoDedadosEColocaEmUmaLista(){
		listaClientes = clienteBusiness.listar(); 
	}
	@Test
	public void ExcluirUmClienteDoBandoDeDados() {
		clienteBusiness.deletar(cliente);
		
	}
	@Test
	public void AlterarUmClienteNoBancoDeDados() {
		cliente.setId(2);
		pessoaFisica.setIdade(22);
		cliente.setPessoaFisica(pessoaFisica);
		clienteBusiness.alterar(cliente);
	}
}

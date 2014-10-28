package br.com.fip.pp.exoticacalcados.testes;

import java.util.List;

import br.com.fip.pp.exoticacalcados.business.ClienteBusiness;
import br.com.fip.pp.exoticacalcados.entidades.Cliente;
import br.com.fip.pp.exoticacalcados.entidades.Pessoa;
import br.com.fip.pp.exoticacalcados.entidades.PessoaFisica;

public class ClienteTeste {
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		PessoaFisica pessoaFisica = new PessoaFisica();
		Cliente cliente = new Cliente();
		/*pessoa.setNome("Alex");
		pessoa.setCidade("Coremas");
		pessoa.setCep("1823781293");
		pessoa.setEstado("PB");
		pessoa.setRua("Rua");
		pessoaFisica.setCpf("12738719");
		pessoaFisica.setEmail("asda@asdauh.com");
		pessoaFisica.setIdade(33);
		pessoaFisica.setSexo('M');
		pessoaFisica.setPessoa(pessoa);
		cliente.setPessoaFisica(pessoaFisica);
		*/
		ClienteBusiness cliBusiness = new ClienteBusiness();
		//cliBusiness.salvar(cliente);
		List<Cliente> listaCliente = cliBusiness.listar();
		for (Cliente cliente2 : listaCliente) {
			System.out.println(cliente2.getPessoaFisica().getPessoa().getNome());
		}
		
		
	}

}

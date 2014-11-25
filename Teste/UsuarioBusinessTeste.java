import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import br.com.fip.pp.exoticacalcados.business.UsuarioBusiness;
import br.com.fip.pp.exoticacalcados.entidades.Usuario;

public class UsuarioBusinessTeste {
	List<Usuario> listaUsuario = new ArrayList<Usuario>();
	UsuarioBusiness usuarioBusiness = new UsuarioBusiness();

	@Test
	public void TesntandoSeUmUsuarioEstaSendoInseridoCOmSucessoNoBancoDeDados() {

		Usuario usuario = new Usuario();
		usuario.setNome("luiz");
		usuario.setEmail("luizneto@ffmcombr");
		usuario.setLogin("testelog");
		usuario.setSenha("22");
		usuarioBusiness.salvar(usuario);

	}

	@Test
	public void TestandoSeOmetododListarEstaRetornandoOsusuarios() {
		
	
		listaUsuario = usuarioBusiness.listar();
		Assert.assertNotNull(listaUsuario);
		for (Usuario usuario : listaUsuario) {
			System.out.println(usuario.getNome());
		}
		
	}
	
	@Test
	public void TestandoSeEstaSendoExcluidoUmUsuairoDoBancoDeDados() {
		Usuario usuario = new Usuario();
		usuario.setId(43);
		usuarioBusiness.deletar(usuario);	
	
	}
	@Test
	public void TestandoSeUmUsusarioEstaSendoAtualizado(){
		Usuario usuario = new Usuario();
		usuario.setId(4);
		usuario.setNome("Luiz");
		usuario.setLogin("testelognovamente");
		usuario.setSenha("luizneto22");
		usuario.setEmail("luizneto@ffm.com.br");
		usuarioBusiness.alterar(usuario);
	}
		
	
	

}

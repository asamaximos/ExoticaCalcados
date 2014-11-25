import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.fip.pp.exoticacalcados.business.ProdutoBusiness;
import br.com.fip.pp.exoticacalcados.entidades.Produto;

public class ProdutobusinessTeste {
	private Produto produto = new Produto();
	private List<Produto> listaProdutos = new ArrayList<Produto>();
	private ProdutoBusiness produtoBusiness = new ProdutoBusiness();

	@Test
	public void TesteSeEstaSendoInseridoUmProdutoNoBancoDeDados() {
		produto.setCodigo(122);
		produto.setMarca("Adidas");
		produto.setObservação("chuteira adidas predartor");
		produto.setQuantidade(213);
		produto.setReferencia("12334");
		produto.setValorDeCompra(2321);
		produto.setValorDeVenda(3322);
		produtoBusiness.salvar(produto);

	}

	@Test
	public void TesteSeEstaSendoExcluidoUmProdutoDoBancoDeDados() {
		produtoBusiness.deletar(produto);
	}

	@Test
	public void TesteSeEstaSendoAlteradoUmProdutoNoBancoDeDados() {
		produtoBusiness.alterar(produto);
	}

	@Test
	public void TeseteSeAListaContemOsProdutosQueEstaoNOBancoDeDados() {
		listaProdutos = produtoBusiness.listar();
	}

}

package br.com.fip.pp.exoticacalcados.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.fip.pp.exoticacalcados.entidades.Cliente;
import br.com.fip.pp.exoticacalcados.entidades.Item;
import br.com.fip.pp.exoticacalcados.entidades.Produto;
import br.com.fip.pp.exoticacalcados.entidades.Vendas;
/**
 * 
 * Classe de controle de Vendas para a interface gr�fica.
 * 
 * @author Michel
 */
@ManagedBean
@ViewScoped
public class VendasBean implements Serializable{
	private Vendas vendas;
	private List<Item> listaItens;
	private Cliente cliente;
	private Produto produto;
	private Item item;
	
	public VendasBean() {
		this.vendas = new Vendas();
		this.cliente = new Cliente();
		this.produto = new Produto();
		this.listaItens = new ArrayList<Item>();
	}
	

	/**
	 * M�todo utilizado para capturar a lista de itens
	 * @return listaItens
	 * 
	 */
	public List<Item> getListaItens() {
		return listaItens;
	}

	/**
	 * Define os itens para a inser��o na lista
	 * @param listaItens
	 */
	public void setListaItens() {
		this.listaItens.add(item);
	}
	

	/**
	 * M�todo ultilizado para capturar um cliente
	 * @return um cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}
	/**
	 * Define um cliente para a vari�vel
	 * 
	 * @param cliente
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * M�todo ultilizado para capturar um produto
	 * @return um produto
	 */
	public Produto getProduto() {
		return produto;
	}

	/**
	 * Define um produto para a vari�vel
	 * 
	 * @param produto
	 */
	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	/**
	 * M�todo ultilizado para capturar um item
	 * @return um item
	 */
	public Item getItem() {
		return item;
	}

	/**
	 * Define um item para a vari�vel
	 * 
	 * @param item
	 */
	public void setItem(Item item) {
		this.item = item;
	}
	
	
}

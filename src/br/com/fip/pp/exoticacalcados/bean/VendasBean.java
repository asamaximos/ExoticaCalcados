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
	 * @return the listaItens
	 */
	public List<Item> getListaItens() {
		return listaItens;
	}

	/**
	 * @param listaItens the listaItens to set
	 */
	public void setListaItens() {
		this.listaItens.add(item);
	}
	

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the produto
	 */
	public Produto getProduto() {
		return produto;
	}

	/**
	 * @param produto the produto to set
	 */
	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	/**
	 * @return the item
	 */
	public Item getItem() {
		return item;
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(Item item) {
		this.item = item;
	}
	
	
}

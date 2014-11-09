package br.com.fip.pp.exoticacalcados.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;


@Entity
@Table (name = "item")
public class Item implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column (name="quantidade")
	private int quantidade;
	@OneToOne
	@Cascade (CascadeType.ALL)
	@JoinColumn (name="idProduto")
	private Produto produto;
	@ManyToOne
	@Cascade (CascadeType.ALL)
	@JoinColumn (name="idVenda", nullable= false, referencedColumnName = "id")
	private Vendas venda;
	
	
	/**
	 * @return the venda
	 */
	public Vendas getVenda() {
		return venda;
	}
	/**
	 * @param venda the venda to set
	 */
	public void setVenda(Vendas venda) {
		this.venda = venda;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the quantidade
	 */
	public int getQuantidade() {
		return quantidade;
	}
	/**
	 * @param quantidade the quantidade to set
	 */
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
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
	
	
	
	
}

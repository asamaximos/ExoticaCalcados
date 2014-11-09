package br.com.fip.pp.exoticacalcados.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "Venda")
public class Vendas implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@OneToOne
	@Cascade(CascadeType.ALL)
	@JoinColumn(name = "idCliente")
	private Cliente cliente;
	@OneToOne
	@Cascade(CascadeType.ALL)
	@JoinColumn(name = "idFormaPagamento")
	private FormaDePagamento pagamento;
	@OneToMany
	@Cascade(CascadeType.ALL)
	@JoinColumn(name = "idItens")
	private List<Item> listaItem;
	@Column(name = "total")
	private double total;
	
	
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
	 * @return the pagamento
	 */
	public FormaDePagamento getPagamento() {
		return pagamento;
	}
	/**
	 * @param pagamento the pagamento to set
	 */
	public void setPagamento(FormaDePagamento pagamento) {
		this.pagamento = pagamento;
	}

	/**
	 * @return the listaItem
	 */
	public List<Item> getListaItem() {
		return listaItem;
	}
	/**
	 * @param listaItem the listaItem to set
	 */
	public void setListaItem(List<Item> listaItem) {
		this.listaItem = listaItem;
	}
	/**
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal() {
		for (Item item : listaItem) {
			this.total += (item.getProduto().getValorDeVenda()*item.getQuantidade());
		}
		
		
	}
	
	

}

package br.com.fip.pp.exoticacalcados.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "Produto")
@Entity
public class Produto implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private int codigo;
	@Column
	private String marca;
	@Column
	private int quantidade;
	@Column
	private String Observação;
	@Column
	private double ValorDeCompra;
	@Column
	private double ValorDeVenda;
	@Column
	private String referencia;

	public Produto() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getObservação() {
		return Observação;
	}

	public void setObservação(String observação) {
		Observação = observação;
	}

	public double getValorDeCompra() {
		return ValorDeCompra;
	}

	public void setValorDeCompra(double valorDeCompra) {
		ValorDeCompra = valorDeCompra;
	}

	public double getValorDeVenda() {
		return ValorDeVenda;
	}

	public void setValorDeVenda(double valorDeVenda) {
		ValorDeVenda = valorDeVenda;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public int getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(int quanttidade) {
		this.quantidade = quanttidade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (id != other.id)
			return false;
		return true;
	}

}

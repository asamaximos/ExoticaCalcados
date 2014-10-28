package br.com.fip.pp.exoticacalcados.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Produto")
public class Produto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private int codigo; 
	private String marca;
	private String Observação;
	private double ValorDeCompra;
	private double ValorDeVenda;
	

}

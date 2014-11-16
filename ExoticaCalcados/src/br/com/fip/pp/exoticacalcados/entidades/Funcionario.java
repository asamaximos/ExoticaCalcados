package br.com.fip.pp.exoticacalcados.entidades;

import java.io.Serializable;
import java.sql.Date;
import java.text.DateFormat;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "Funcionario")
public class Funcionario implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "cargo")
	private String cargo;
	@Temporal(TemporalType.DATE)
	private Calendar dataAdmissao;
	@Column(name = "salario")
	private double salario;
	@OneToOne
	@Cascade(CascadeType.ALL)
	private PessoaFisica pessoaFisica;
	
	public Funcionario() {
		Calendar.getInstance();
	}

	/**
	 * @return the pessoaFisica
	 */
	public PessoaFisica getPessoaFisica() {
		return pessoaFisica;
	}

	/**
	 * @param pessoaFisica
	 *            the pessoaFisica to set
	 */
	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Calendar getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Calendar dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}

package com.leporonitech.appmanageproposals.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Concorrente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "Campo nome é obrigatório!")
	private String nome;

	@OneToMany(mappedBy = "concorrente")
	private List<Cliente> clientes = new ArrayList<>();

	@NotNull(message = "Campo Taxa de Debito da Concorrente é obrigatório!")
	private Double taxaDebitoConcorrente;

	@NotNull(message = "Campo Taxa de Crédito da Concorrente é obrigatório!")
	private Double taxaCreditoConcorrente;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Double getTaxaDebitoConcorrente() {
		return taxaDebitoConcorrente;
	}

	public void setTaxaDebitoConcorrente(Double taxaDebitoConcorrente) {
		this.taxaDebitoConcorrente = taxaDebitoConcorrente;
	}

	public Double getTaxaCreditoConcorrente() {
		return taxaCreditoConcorrente;
	}

	public void setTaxaCreditoConcorrente(Double taxaCreditoConcorrente) {
		this.taxaCreditoConcorrente = taxaCreditoConcorrente;
	}

}

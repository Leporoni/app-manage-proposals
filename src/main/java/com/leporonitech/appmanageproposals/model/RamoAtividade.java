package com.leporonitech.appmanageproposals.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class RamoAtividade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "Campo nome é obrigatório!")
	private String nome;

	@JsonIgnore
	@OneToMany(mappedBy = "ramoAtividade")
	private List<Cliente> clientes = new ArrayList<>();

	@NotNull(message = "Campo taxa mínima de crédito é obrigatório!")
	private Double taxaMinimaCredito;

	@NotNull(message = "Campo taxa mínima de débito é obrigatório!")
	private Double taxaMinimaDebito;

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

	public Double getTaxaMinimaCredito() {
		return taxaMinimaCredito;
	}

	public void setTaxaMinimaCredito(Double taxaMinimaCredito) {
		this.taxaMinimaCredito = taxaMinimaCredito;
	}

	public Double getTaxaMinimaDebito() {
		return taxaMinimaDebito;
	}

	public void setTaxaMinimaDebito(Double taxaMinimaDebito) {
		this.taxaMinimaDebito = taxaMinimaDebito;
	}

}

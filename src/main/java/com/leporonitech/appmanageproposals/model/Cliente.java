package com.leporonitech.appmanageproposals.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
public class Cliente {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;

	@NotNull(message = "Campo concorrente é obrigatório!")
	private List<String> concorrentes;

	@NotNull(message = "CNPJ ou CPF inválido")
	private String cnpjCpf;

	@NotNull(message = "Campo telefone é obrigatório!")
	private String telefone;

	@Length(min = 5, max = 100, message = "Email deve conter entre 5 e 100 caracteres!")
	private String email;

	@NotNull(message = "Campo ramo de atividade é obrigatório!")
	private List<String> ramoAtividade;

	@NotNull(message = "Campo taxa débito da concorrente é obrigatório!")
	private Double taxaDebitoConcorrente;

	@NotNull(message = "Campo desconto débito é obrigatório!")
	private Double descontoDebito;

	@NotNull(message = "Campo taxa crédito da concorrente é obrigatório!")
	private Double taxaCreditoConcorrente;

	@NotNull(message = "Campo desconto crédito é obrigatório!")
	private Double descontoCredito;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<String> getConcorrentes() {
		return concorrentes;
	}

	public void setConcorrentes(List<String> concorrentes) {
		this.concorrentes = concorrentes;
	}

	public String getCnpjCpf() {
		return cnpjCpf;
	}

	public void setCnpjCpf(String cnpjCpf) {
		this.cnpjCpf = cnpjCpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getRamoAtividade() {
		return ramoAtividade;
	}

	public void setRamoAtividade(List<String> ramoAtividade) {
		this.ramoAtividade = ramoAtividade;
	}

	public Double getTaxaDebitoConcorrente() {
		return taxaDebitoConcorrente;
	}

	public void setTaxaDebitoConcorrente(Double taxaDebitoConcorrente) {
		this.taxaDebitoConcorrente = taxaDebitoConcorrente;
	}

	public Double getDescontoDebito() {
		return descontoDebito;
	}

	public void setDescontoDebito(Double descontoDebito) {
		this.descontoDebito = descontoDebito;
	}

	public Double getTaxaCreditoConcorrente() {
		return taxaCreditoConcorrente;
	}

	public void setTaxaCreditoConcorrente(Double taxaCreditoConcorrente) {
		this.taxaCreditoConcorrente = taxaCreditoConcorrente;
	}

	public Double getDescontoCredito() {
		return descontoCredito;
	}

	public void setDescontoCredito(Double descontoCredito) {
		this.descontoCredito = descontoCredito;
	}

}

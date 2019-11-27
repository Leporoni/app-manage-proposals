package com.leporonitech.appmanageproposals.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Proposta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "Campo desconto crédito é obrigatório!")
	private Double descontoCredito;

	@NotNull(message = "Campo desconto débito é obrigatório")
	private Double descontoDebito;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private Date dataDaProposta;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cli_id")
	private Cliente cliente;

	@NotNull
	private Boolean aceita;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getDescontoCredito() {
		return descontoCredito;
	}

	public void setDescontoCredito(Double descontoCredito) {
		this.descontoCredito = descontoCredito;
	}

	public Double getDescontoDebito() {
		return descontoDebito;
	}

	public void setDescontoDebito(Double descontoDebito) {
		this.descontoDebito = descontoDebito;
	}

	public Date getDataDaProposta() {
		return dataDaProposta;
	}

	public void setDataDaProposta(Date dataDaProposta) {
		this.dataDaProposta = dataDaProposta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Boolean getAceita() {
		return aceita;
	}

	public void setAceita(Boolean aceita) {
		this.aceita = aceita;
	}

}

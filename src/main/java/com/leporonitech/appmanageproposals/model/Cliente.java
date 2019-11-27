package com.leporonitech.appmanageproposals.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
public class Cliente {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;

	@OneToOne
	@NotNull(message = "Campo concorrente é obrigatório!")
	private Concorrente concorrente;

	@NotNull(message = "CNPJ ou CPF inválido")
	private String cnpjCpf;

	@NotNull(message = "Campo telefone é obrigatório!")
	private String telefone;

	@Length(min = 5, max = 100, message = "Email deve conter entre 5 e 100 caracteres!")
	private String email;

	@NotNull(message = "Campo ramo de atividade é obrigatório!")
	@ManyToOne
	@JoinColumn(name = "RAMO_ATIVIDADE_ID")
	private RamoAtividade ramoAtividade;

	@OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
	private List<Proposta> propostas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Concorrente getConcorrente() {
		return concorrente;
	}

	public void setConcorrente(Concorrente concorrente) {
		this.concorrente = concorrente;
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

	public RamoAtividade getRamoAtividade() {
		return ramoAtividade;
	}

	public void setRamoAtividade(RamoAtividade ramoAtividade) {
		this.ramoAtividade = ramoAtividade;
	}

	public List<Proposta> getPropostas() {
		return propostas;
	}

	public void setPropostas(List<Proposta> propostas) {
		this.propostas = propostas;
	}

}

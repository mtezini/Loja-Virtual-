package br.com.mvtsolucoes.lojavirtual.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name= "pessoa_fisica")
@PrimaryKeyJoinColumn(name = "id")
public class Pessoa_Fisica extends Pessoa {

	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false)
	private String cpf;
	
	@Column(nullable = false)
	private String rg;
	
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public Date getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	

	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}


	
	
	

}

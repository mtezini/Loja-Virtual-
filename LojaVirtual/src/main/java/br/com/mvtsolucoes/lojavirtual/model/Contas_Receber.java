package br.com.mvtsolucoes.lojavirtual.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import br.com.mvtsolucoes.lojavirtual.enums.Status_Contas_Receber;

@Entity
@Table(name = "contas_receber")
@SequenceGenerator(name = "seq_contas_receber", sequenceName = "seq_contas_receber", allocationSize = 1, initialValue = 1)
public class Contas_Receber {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_contas_receber")
	private Long id;

	private String Descricao;

	@Enumerated(EnumType.STRING)
	private Status_Contas_Receber statuscontareceber;

	@Temporal(TemporalType.DATE)
	@Column(name = "data_vencimento")
	private Date Dt_vencimento;

	@Temporal(TemporalType.DATE)
	@Column(name = "data_pagamento")
	private Date Dt_pagamento;

	@Column(name="Valor_Tago",scale=2,precision=12)
	private BigDecimal Valor_Total;

	@Column(name="Valor_Desconto",scale=2,precision=12)
	private BigDecimal Valor_Desconto;
	
	@ManyToOne(targetEntity = Pessoa.class)
	@JoinColumn(name = "pessoa_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_fk"))
	private Pessoa pessoa;

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public Status_Contas_Receber getStatus() {
		return statuscontareceber;
	}

	public void setStatus(Status_Contas_Receber status) {
		statuscontareceber = status;
	}

	public Date getDt_vencimento() {
		return Dt_vencimento;
	}

	public void setDt_vencimento(Date dt_vencimento) {
		Dt_vencimento = dt_vencimento;
	}

	public Date getDt_pagamento() {
		return Dt_pagamento;
	}

	public void setDt_pagamento(Date dt_pagamento) {
		Dt_pagamento = dt_pagamento;
	}

	public BigDecimal getValor_Total() {
		return Valor_Total;
	}

	public void setValor_Total(BigDecimal valor_Total) {
		Valor_Total = valor_Total;
	}

	public BigDecimal getValor_Desconto() {
		return Valor_Desconto;
	}

	public void setValor_desconto(BigDecimal valor_Desconto) {
		Valor_Desconto = valor_Desconto;
	}

	public Status_Contas_Receber getStatuscontareceber() {
		return statuscontareceber;
	}

	public void setStatuscontareceber(Status_Contas_Receber statuscontareceber) {
		this.statuscontareceber = statuscontareceber;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public void setValor_Desconto(BigDecimal valor_Desconto) {
		Valor_Desconto = valor_Desconto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Contas_Receber other = (Contas_Receber) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	

}

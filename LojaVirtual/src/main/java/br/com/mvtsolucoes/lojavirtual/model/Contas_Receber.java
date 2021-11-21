package br.com.mvtsolucoes.lojavirtual.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

	private Status_Contas_Receber Status;

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

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public Status_Contas_Receber getStatus() {
		return Status;
	}

	public void setStatus(Status_Contas_Receber status) {
		Status = status;
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
		Contas_Receber other = (Contas_Receber) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Contas_Receber [Descricao=" + Descricao + ", Status=" + Status + ", Dt_vencimento=" + Dt_vencimento
				+ ", Dt_pagamento=" + Dt_pagamento + ", Valor_Total=" + Valor_Total + ", Valor_desconto="
				+ Valor_Desconto + "]";
	}

}

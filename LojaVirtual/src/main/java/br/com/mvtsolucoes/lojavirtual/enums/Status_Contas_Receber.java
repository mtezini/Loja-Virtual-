package br.com.mvtsolucoes.lojavirtual.enums;

public enum Status_Contas_Receber {
	
	Pendente ("Pendente"),
	Pago("Pago"),
	Cancelado ("Cancelado");
	
	
	private String Status_Contas_Receber;
		

	private Status_Contas_Receber(String status_Contas_Receber) {
		this.Status_Contas_Receber = status_Contas_Receber;
	}

	public String getStatus_Contas_Receber() {
		return Status_Contas_Receber;
	}

	public void setStatus_Contas_Receber(String status_Contas_Receber) {
		this.Status_Contas_Receber = status_Contas_Receber;
	}

}




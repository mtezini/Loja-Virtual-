package br.com.mvtsolucoes.lojavirtual.enums;

public enum Tipo_Endereco   {
	
	ENDERECO_ENTREGA ("Endereço de Entrega"),
	ENDERECO_RESIDENCIAL ("Endereço_Residencial"),
	ENDERECO_COMERCIAL ("Endereço_Comercial"),
	ENDERECO_COBRANÇA("Endereco_Cobrança");
	

	private String Tipo_Entrega;

	
	Tipo_Endereco(String string) {
		
	}

	public String getTipo_Entrega() {
		return Tipo_Entrega;
	}

	public void setTipo_Entrega(String tipo_Entrega) {
		this.Tipo_Entrega = tipo_Entrega;
	}
	
	
}

package br.com.mvtsolucoes.lojavirtual.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "forma_pagamento")
@SequenceGenerator(name = "seq_forma_pagamento", sequenceName = "seq_forma_pagamento", allocationSize = 1, initialValue = 1)
public class Forma_Pagamento implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	
	

}

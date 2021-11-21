package br.com.mvtsolucoes.lojavirtual.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;



@Entity
@Table(name = "usuario")
@SequenceGenerator(name = "seq_usuario", sequenceName = "seq_usuario", allocationSize = 1, initialValue = 1)
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_Usuario")
	private Long id;

	@Column(nullable = false)
	private String login;
	@Column(nullable = false)
	private String senha;
	@Column(name = "data_atual_senha")
	@Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
	private LocalDate dataatualsenha;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public LocalDate getDataatualsenha() {
		return dataatualsenha;
	}
	public void setDataatualsenha(LocalDate dataatualsenha) {
		this.dataatualsenha = dataatualsenha;
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
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}


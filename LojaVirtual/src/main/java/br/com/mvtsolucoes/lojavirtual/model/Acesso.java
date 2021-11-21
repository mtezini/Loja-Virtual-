package br.com.mvtsolucoes.lojavirtual.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name= "acesso")
@SequenceGenerator( name= "seq_acesso", sequenceName = "seq_acesso", allocationSize = 1, initialValue= 1 )
public class Acesso implements GrantedAuthority{

	private static final long serialVersionUID = 1L;

	@Override
	public String getAuthority() {
		
		return this.Acesso_Descricao;
	}

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_acesso")
	private Long id;
	
	@Column(nullable = false)
	private String Acesso_Descricao; /* Acesso : Ex: ROLE_ADMIN ou ROLE_VENDEDOR */

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAcesso_Descricao() {
		return Acesso_Descricao;
	}

	public void setAcesso_Descricao(String acesso_Descricao) {
		Acesso_Descricao = acesso_Descricao;
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
		Acesso other = (Acesso) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Acesso [Acesso_Descricao=" + Acesso_Descricao + "]";
	}

	

	

}

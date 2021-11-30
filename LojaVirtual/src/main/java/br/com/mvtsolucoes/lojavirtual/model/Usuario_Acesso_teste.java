package br.com.mvtsolucoes.lojavirtual.model;

import java.io.Serializable;

import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/*

@Entity
@Table(name = "usuario_acesso")
@SequenceGenerator(name = "seq_usuario_acesso", sequenceName = "seq_usuario_acesso", allocationSize = 1, initialValue = 1)
public class Usuario_Acesso_teste implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_usuario_acesso")
	private Long id;
	
	@OneToOne(targetEntity = Pessoa.class)
	@JoinColumn(name = "usuario_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "usuario_fk"))
	private Usuario usuario;
	
	@OneToOne(targetEntity = Pessoa.class)
	@JoinColumn(name = "acesso_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "acesso_fk"))
	private Acesso acesso;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Acesso getAcesso() {
		return acesso;
	}

	public void setAcesso(Acesso acesso) {
		this.acesso = acesso;
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
		Usuario_Acesso_teste other = (Usuario_Acesso_teste) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario_Acesso [usuario=" + usuario + ", acesso=" + acesso + "]";
	}
	
	
	
	
}
*/
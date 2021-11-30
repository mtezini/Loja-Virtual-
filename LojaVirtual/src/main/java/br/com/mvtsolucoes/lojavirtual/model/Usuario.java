package br.com.mvtsolucoes.lojavirtual.model;


import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


@Entity
@Table(name = "usuario")
@SequenceGenerator(name = "seq_usuario", sequenceName = "seq_usuario", allocationSize = 1, initialValue = 1)
public class Usuario implements UserDetails{

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
	
	
	@OneToMany(fetch =  FetchType.LAZY)
	@JoinTable (name= "usuario_acesso", uniqueConstraints =  @UniqueConstraint (columnNames = {"usuario_id", "acesso_id"} ,
	name = "unique_acesso_user" ), joinColumns = @JoinColumn (name = "usuario_id", referencedColumnName = "id", 
	table = "usuario", unique = false, foreignKey = @ForeignKey (name = "usuario_fk", value = ConstraintMode.CONSTRAINT) ),
	inverseJoinColumns = @JoinColumn(name = "acesso_id", unique = false, referencedColumnName = "id", 
	table = "acesso", foreignKey = @ForeignKey (name = "acesso_fk")))
	private List<Acesso> acessos;
	
	
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
	
	public List<Acesso> getAcessos() {
		return acessos;
	}
	public void setAcessos(List<Acesso> acessos) {
		this.acessos = acessos;
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
	
	
	/*Autoridades = São os acessos, ou seja ROLE_ADMIN, ROLE_USUARIO */
	
	
	
	@Override
	public java.util.Collection<? extends GrantedAuthority> getAuthorities() {
		
		return this.acessos;
	}
	@Override
	public String getPassword() {

		return this.senha;
	}
	@Override
	public String getUsername() {

		return this.login;
	}
	@Override
	public boolean isAccountNonExpired() {

		return true;
	}
	@Override
	public boolean isAccountNonLocked() {

		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {

		return true;
	}
	@Override
	public boolean isEnabled() {
		return true;
	}
	
}


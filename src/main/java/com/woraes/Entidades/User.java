package com.woraes.Entidades;

import java.io.Serializable;
import java.util.Objects;

// criada Primeira classe Entidades 
/*implements Serializable serve para trasformar os objetos em cadeias de bytes para
que os objetos possam trafegar na rede e serem garvados*/
public class User implements Serializable {

	
	/**icrementar tipo um cpf para User
	 *
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private String nome;
	private String email;
	private String celular;
	private String senha;
	
	/* Basico de Entidades
	 * criar um Construtor como está usando
	framework obrigado a colocar um construtor vazio
	apos isso ir em source generate constructor filds
	depois criar os gets end setters
	depois criar os metodos de comparação headcode e equal*/
	public User() {
		
	}

	public User(long id, String nome, String email, String celular, String senha) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.celular = celular;
		this.senha = senha;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return id == other.id;
	}

	
}

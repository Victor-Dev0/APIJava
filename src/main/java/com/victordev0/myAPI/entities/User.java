package com.victordev0.myAPI.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	private Long id;
	private String username;
	private String senha;
	
	private List<Comment> comments = new ArrayList<>();
	
	
	public User() {
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public User(Long id, String username, String senha) {
		super();
		this.id = id;
		this.username = username;
		this.senha = senha;
	}
	
	@JsonIgnore
	public List<Comment> getComments() {
		return comments;
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
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
	
}

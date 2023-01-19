package com.victordev0.myAPI.entities;

import java.io.Serializable;
import java.util.Objects;

public class Comment implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String comment;
	
	private User user;
	
	public Comment() {
	}

	public Comment(Long id, String comment, User user) {
		super();
		this.id = id;
		this.comment = comment;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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
		Comment other = (Comment) obj;
		return Objects.equals(id, other.id);
	}
	
	
	

}

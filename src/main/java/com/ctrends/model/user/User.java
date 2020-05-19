package com.ctrends.model.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_tb")
public class User {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "userName")
	private String userName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	public User(int id, String userName) {
		this.id = id;
		this.userName = userName;
	}
	public User() {}
}
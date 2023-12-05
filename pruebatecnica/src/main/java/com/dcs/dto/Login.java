package com.dcs.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="login")
public class Login {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	private String users_name;
	private String users_password;
	
	@ManyToOne
    @JoinColumn(name = "id_user")
    private User id_user;
	
	public Login() {
        super();
    }

	public Login(int id, String users_name, String users_password, User id_user) {
		super();
		this.id = id;
		this.users_name = users_name;
		this.users_password = users_password;
		this.id_user = id_user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsers_name() {
		return users_name;
	}

	public void setUsers_name(String users_name) {
		this.users_name = users_name;
	}

	public String getUsers_password() {
		return users_password;
	}

	public void setUsers_password(String users_password) {
		this.users_password = users_password;
	}

	public User getId_user() {
		return id_user;
	}

	public void setId_user(User id_user) {
		this.id_user = id_user;
	}
	
	
}

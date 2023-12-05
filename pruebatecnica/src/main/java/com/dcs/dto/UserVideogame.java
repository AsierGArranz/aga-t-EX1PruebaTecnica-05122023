package com.dcs.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="users_videogame")
public class UserVideogame {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@ManyToOne
    @JoinColumn(name = "id_user")
    private User id_user;
	
	@ManyToOne
    @JoinColumn(name = "id_videogame")
    private User id_videogame;

	
	public UserVideogame() {
		super();
	}


	public UserVideogame(int id, User id_user, User id_videogame) {
		super();
		this.id = id;
		this.id_user = id_user;
		this.id_videogame = id_videogame;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public User getId_user() {
		return id_user;
	}


	public void setId_user(User id_user) {
		this.id_user = id_user;
	}


	public User getId_videogame() {
		return id_videogame;
	}


	public void setId_videogame(User id_videogame) {
		this.id_videogame = id_videogame;
	}
	
	

}

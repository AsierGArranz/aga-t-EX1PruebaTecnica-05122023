package com.dcs.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="party")
public class Party {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@ManyToOne
    @JoinColumn(name = "user_videogame_id")
    private User id_uv;
	
	private String name;

	public Party(int id, User id_uv, String name) {
		super();
		this.id = id;
		this.id_uv = id_uv;
		this.name = name;
	}

	public Party() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getId_uv() {
		return id_uv;
	}

	public void setId_uv(User id_uv) {
		this.id_uv = id_uv;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}

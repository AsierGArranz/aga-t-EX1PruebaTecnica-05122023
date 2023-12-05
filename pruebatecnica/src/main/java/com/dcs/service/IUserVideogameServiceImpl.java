package com.dcs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dcs.dao.IUserVideogameDAO;
import com.dcs.dto.UserVideogame;

public class IUserVideogameServiceImpl implements IUserVideogameService{
	
	@Autowired
	IUserVideogameDAO dao;
	@Override
	public List<UserVideogame> listUserVideogame() {
		return dao.findAll();
	}

	@Override
	public UserVideogame listById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public UserVideogame updateUserVideogame(UserVideogame uv) {
		return dao.save(uv);
	}

	@Override
	public UserVideogame addUserVideogame(UserVideogame uv) {
		return dao.save(uv);
	}

	@Override
	public void deleteByIdUserVideogame(Integer id) {
		dao.deleteById(id); 
		
	}

	@Override
	public UserVideogame findByUserIdAndVideogameId(Integer id_user, Integer id_videogame) {
		return dao.findByUserIdAndVideogameId(id_user, id_videogame);
	}

}

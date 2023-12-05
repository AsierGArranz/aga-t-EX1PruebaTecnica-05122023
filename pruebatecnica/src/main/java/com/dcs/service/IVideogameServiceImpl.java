package com.dcs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dcs.dao.IVideogameDAO;
import com.dcs.dto.User;
import com.dcs.dto.Videogames;

@Service
public class IVideogameServiceImpl implements IVideogameService{
	
	@Autowired
	IVideogameDAO ivideogameDAO;

	@Override
	public List<Videogames> listVideogames() {
		return ivideogameDAO.findAll();
	}

	@Override
	public Videogames userById(Integer id) {
		return ivideogameDAO.findById(id).get();
	}

	@Override
	public Videogames saveVideogames(Videogames Videogames) {
		return ivideogameDAO.save(Videogames);
	}

	@Override
	public Videogames updateVideogames(Videogames Videogames) {
		return ivideogameDAO.save(Videogames);
	}

	@Override
	public void deleteByIdVideogames(Integer id) {
		ivideogameDAO.deleteById(id);
		
	}

	public Videogames listById(Integer id) {
		return ivideogameDAO.findById(id).get();
	}

}

package com.dcs.service;

import java.util.List;

import com.dcs.dto.Videogames;

public interface IVideogameService {
		//Listar todos
		public List<Videogames> listVideogames();
		
		//Listar por id
		public Videogames userById(Integer id); 
		
		//Guardar
		public Videogames saveVideogames(Videogames Videogames);
		
		//Actualizar
		public Videogames updateVideogames(Videogames Videogames);
		
		//Eliminar
		public void deleteByIdVideogames(Integer id);
}

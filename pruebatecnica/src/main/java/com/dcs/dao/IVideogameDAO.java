package com.dcs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dcs.dto.Videogames;

public interface IVideogameDAO extends JpaRepository<Videogames,Integer> {

}

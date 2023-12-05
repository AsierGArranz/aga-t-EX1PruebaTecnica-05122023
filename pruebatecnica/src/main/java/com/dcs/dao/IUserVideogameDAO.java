package com.dcs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dcs.dto.UserVideogame;

public interface IUserVideogameDAO extends JpaRepository<UserVideogame, Integer>{
	@Query(value = "SELECT * FROM login WHERE id_user = ?1 AND id_videogame = ?2", nativeQuery = true)
	UserVideogame findByUserIdAndVideogameId(Integer userId, Integer videogameId);
}

package com.dcs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dcs.dto.Login;
import com.dcs.dto.Party;

public interface IPartyDAO extends JpaRepository<Party, Integer>{
	@Query(value = "SELECT * FROM login WHERE user_videogame_id = ?1", nativeQuery = true)
	Login findByUVId(Integer uvId);
}

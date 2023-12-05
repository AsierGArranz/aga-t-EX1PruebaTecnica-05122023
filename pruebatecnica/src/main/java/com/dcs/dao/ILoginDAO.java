package com.dcs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dcs.dto.Login;

public interface ILoginDAO extends JpaRepository<Login, Integer>{
	@Query(value = "SELECT * FROM login WHERE id_user = ?1", nativeQuery = true)
	Login findByUserId(Integer userId);
    

}

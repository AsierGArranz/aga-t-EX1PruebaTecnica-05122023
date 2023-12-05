package com.dcs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dcs.dao.ILoginDAO;
import com.dcs.dto.Login;

public class ILoginServiceImpl implements ILoginService{
	
	@Autowired
	ILoginDAO dao;

	@Override
	public List<Login> listLogin() {
		return dao.findAll();
	}

	@Override
	public Login listById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public Login updateLogin(Login log) {
		return dao.save(log);
	}

	@Override
	public Login addLogin(Login log) {
		return dao.save(log);
	}

	@Override
	public void deleteByIdLogin(Integer id) {
		dao.deleteById(id); 
		
	}

	@Override
	public Login findByUserId(Integer id_user) {
		return dao.findByUserId(id_user);
	}

}

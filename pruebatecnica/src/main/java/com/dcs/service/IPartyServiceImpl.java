package com.dcs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dcs.dto.Party;
import com.dcs.dao.IPartyDAO;

public class IPartyServiceImpl implements IPartyService{

	@Autowired
	IPartyService dao;

	@Override
	public List<Party> listParty() {
		return dao.findAll();
	}

	@Override
	public Party listById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public Party updateParty(Party log) {
		return dao.save(log);
	}

	@Override
	public Party addParty(Party log) {
		return dao.save(log);
	}

	@Override
	public void deleteByIdParty(Integer id) {
		dao.deleteById(id); 
		
	}

	@Override
	public Party findByUVId(Integer uv_id) {
		return dao.findByUVId(uv_id);
	}
	
	
}

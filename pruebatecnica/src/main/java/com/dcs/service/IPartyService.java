package com.dcs.service;

import java.util.List;

import com.dcs.dto.Party;

public interface IPartyService {
	
public List<Party> listParty();
    
    public Party listById(Integer id);
    
    public Party updateParty(Party log);
    
    public Party addParty(Party log);
    
    public void deleteByIdParty(Integer id);
    
    public Party findByUVId(Integer uv_id);
}

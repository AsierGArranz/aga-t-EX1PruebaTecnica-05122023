package com.dcs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dcs.dto.Party;
import com.dcs.service.IPartyService;

@RestController
@RequestMapping("/party")
public class PartyController {
	
	@Autowired
	IPartyService pSer;
	

	@GetMapping("/all")
    public List<Party> listParty(){
        return pSer.listParty();
    }
    
    @GetMapping("/{id}")
    public Party listById(@PathVariable(name="id") Integer id) {
        return pSer.listById(id);
    }
    
    @PutMapping("/{id}")
    public Party updateParty(@PathVariable(name="id") Integer id, @RequestBody Party p) {
        
    	Party u1 = pSer.listById(id);
    	Party u2 = new Party();
        
        u1.setId(p.getId());
        u1.setName(u1.getName());
        u1.setId_uv(p.getId_uv());
        
        
        u2 = pSer.updateParty(u1);
        
        return u2;
    }
    
    @PostMapping("/add")
    public Party addLogin(@RequestBody Party p) {
        return pSer.addParty(p);
    }
    
    @DeleteMapping("/{id}")
    public void deleteByIdParty (@PathVariable(name="id") Integer id) {
    	pSer.deleteByIdParty(id);
    }
    
}

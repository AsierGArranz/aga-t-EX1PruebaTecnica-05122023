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

import com.dcs.dto.UserVideogame;
import com.dcs.service.IUserVideogameService;

@RestController
@RequestMapping("/user_videogame")
public class UserVideogameController {
	
	@Autowired
	IUserVideogameService uvSer;
	
	@GetMapping("/all")
    public List<UserVideogame> listUserVideogame(){
        return uvSer.listUserVideogame();
    }
    
    @GetMapping("/{id}")
    public UserVideogame listById(@PathVariable(name="id") Integer id) {
        return uvSer.listById(id);
    }
    
    @PutMapping("/{id}")
    public UserVideogame updateUserVideogame(@PathVariable(name="id") Integer id, @RequestBody UserVideogame uv) {
        
    	UserVideogame u1 = uvSer.listById(id);
    	UserVideogame u2 = new UserVideogame();
        
        u1.setId(uv.getId());
        u1.setId_user(uv.getId_user());
        u1.setId_videogame(uv.getId_videogame());
        
        
        u2 = uvSer.updateUserVideogame(u1);
        
        return u2;
    }
    
    @PostMapping("/add")
    public UserVideogame addUserVideogame(@RequestBody UserVideogame uv) {
        return uvSer.addUserVideogame(uv);
    }
    
    @DeleteMapping("/{id}")
    public void deleteByIdUserVideogame (@PathVariable(name="id") Integer id) {
    	uvSer.deleteByIdUserVideogame(id);
    }
}

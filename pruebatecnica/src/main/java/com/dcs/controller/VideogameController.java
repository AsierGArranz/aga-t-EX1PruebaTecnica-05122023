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

import com.dcs.dto.Videogames;
import com.dcs.service.IVideogameServiceImpl;

@RestController
@RequestMapping("/videogames")
public class VideogameController {
	
	@Autowired
	private IVideogameServiceImpl vSer;

	@GetMapping("/all")
	public List<Videogames> listarVideogames(){
		return vSer.listVideogames();
	}
	
	@PutMapping("/{id}")
	public Videogames updateVideogames(@PathVariable(name="id") Integer id, @RequestBody Videogames u) {
		
		Videogames u1 = vSer.listById(id);
		Videogames u2 = new Videogames();
		
		u1.setId(u.getId());
		u1.setName(u.getName());
		
		u2 = vSer.updateVideogames(u1);
		
		return u2;
	}
	
	@PostMapping("/add")
	public Videogames salvarVideogames(@RequestBody Videogames Videogames) {
		return vSer.saveVideogames(Videogames);
	}
	
	@DeleteMapping("/{id}")
	public void deleteByIdVideogames (@PathVariable(name="id") Integer id) {
		vSer.deleteByIdVideogames(id);
	}

}

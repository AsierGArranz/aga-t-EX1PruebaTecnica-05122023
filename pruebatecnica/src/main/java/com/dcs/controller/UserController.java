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

import com.dcs.dto.User;
import com.dcs.service.IUserServiceImpl;


@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private IUserServiceImpl userServiceImpl;

	@GetMapping("/all")
	public List<User> listarUsers(){
		return userServiceImpl.listUsers();
	}
	
	@PutMapping("/{id}")
	public User updateUser(@PathVariable(name="id") Integer id, @RequestBody User u) {
		
		User u1 = userServiceImpl.listById(id);
		User u2 = new User();
		
		u1.setId(u.getId());
		u1.setName(u.getName());
		u1.setEmail(u.getEmail());
		u1.setSteam(u.getSteam());
		
		u2 = userServiceImpl.updateUser(u1);
		
		return u2;
	}
	
	@PostMapping("/add")
	public User salvaruser(@RequestBody User user) {
		return userServiceImpl.saveUser(user);
	}
	
	@DeleteMapping("/{id}")
	public void deleteByIdInterview (@PathVariable(name="id") Integer id) {
		userServiceImpl.deleteByIdUser(id);
	}
	
}

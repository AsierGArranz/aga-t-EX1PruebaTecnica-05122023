package com.dcs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dcs.dto.Login;
import com.dcs.service.ILoginService;
import com.dcs.service.ILoginServiceImpl;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	ILoginService lSer;
	
	@Autowired
	ILoginServiceImpl lSerI;
	
	@GetMapping("/all")
    public List<Login> listLogin(){
        return lSer.listLogin();
    }
    
    @GetMapping("/{id}")
    public Login listById(@PathVariable(name="id") Integer id) {
        return lSer.listById(id);
    }
    
    @PutMapping("/{id}")
    public Login updateLogin(@PathVariable(name="id") Integer id, @RequestBody Login log) {
        
    	Login u1 = lSer.listById(id);
    	Login u2 = new Login();
        
        u1.setId(log.getId());
        u1.setUsers_name(log.getUsers_name());
        u1.setUsers_password(log.getUsers_password());
        u1.setId_user(log.getId_user());
        
        u2 = lSer.updateLogin(u1);
        
        return u2;
    }
    
    @PostMapping("/add")
    public Login addLogin(@RequestBody Login log) {
        return lSer.addLogin(log);
    }
    
    @DeleteMapping("/{id}")
    public void deleteByIdLogin (@PathVariable(name="id") Integer id) {
    	lSer.deleteByIdLogin(id);
    }
    
    
}

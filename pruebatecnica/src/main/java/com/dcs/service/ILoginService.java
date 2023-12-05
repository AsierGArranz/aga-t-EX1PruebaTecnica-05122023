package com.dcs.service;

import java.util.List;

import com.dcs.dto.Login;

public interface ILoginService {
	
	public List<Login> listLogin();
    
    public Login listById(Integer id);
    
    public Login updateLogin(Login log);
    
    public Login addLogin(Login log);
    
    public void deleteByIdLogin(Integer id);
    
    public Login findByUserId(Integer id_user);
}

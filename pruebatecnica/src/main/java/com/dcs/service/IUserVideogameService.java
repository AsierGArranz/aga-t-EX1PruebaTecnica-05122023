package com.dcs.service;

import java.util.List;

import com.dcs.dto.UserVideogame;

public interface IUserVideogameService {

	public List<UserVideogame> listUserVideogame();
    
    public UserVideogame listById(Integer id);
    
    public UserVideogame updateUserVideogame(UserVideogame uv);
    
    public UserVideogame addUserVideogame(UserVideogame uv);
    
    public void deleteByIdUserVideogame(Integer id);
    
    public UserVideogame findByUserIdAndVideogameId(Integer id_user, Integer id_videogame);
}

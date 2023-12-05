package com.dcs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dcs.dao.IUserDAO;
import com.dcs.dto.Interview;
import com.dcs.dto.User;

@Service
public class IUserServiceImpl implements IUserService {
	
	@Autowired
	IUserDAO iuserDAO;

	//Listar todos
		public List<User> listUsers(){
			return iuserDAO.findAll();
		};
		
		//Listar por id
		public User userById(Integer id) {
			return iuserDAO.findById(id).get();
		}; 
		//Guardar
		public User saveUser(User user) {
			return iuserDAO.save(user);
		};
		//Actualizar
		public User updateUser(User user) {
			return iuserDAO.save(user);
		};
		//Eliminar
		public void deleteByIdUser(Integer id) {
			iuserDAO.deleteById(id);
		}

		public User listById(Integer id) {
			// TODO Auto-generated method stub
			return iuserDAO.findById(id).get();
		}

		

}

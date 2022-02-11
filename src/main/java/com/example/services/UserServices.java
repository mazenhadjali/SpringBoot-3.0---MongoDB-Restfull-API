package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.repository.UserRepository;


@Service
public class UserServices {
	
	@Autowired
	private UserRepository userrepo;
	
	public void addUser(User user) {
		userrepo.save(user);
	}
	
	public List<User> getAllUsers(){
		return userrepo.findAll();
	}

	public void deleteUser(String id) {
		userrepo.deleteById(id);
		
	}

	public Optional<User> getuserbyid(String id) {
		return userrepo.findById(id);
	}

}

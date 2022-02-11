package com.example.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.services.UserServices;


@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserServices UserS;
	
	@GetMapping
	public List<User> getUsers(){
		return UserS.getAllUsers();
	}
	
	@PostMapping
	public void addUser(@RequestBody User user) {
	    UserS.addUser(user);
	}
	
	//http://localhost:8080/users/62059194b5b04700b0a66aff <---- this is the id in path not in req params /****
	@DeleteMapping(value = "/{id}")
	public void deleteBill(@PathVariable("id") String id){
		UserS.deleteUser(id);
   }
	 
	@GetMapping(value = "/{id}")
	public Optional<User> getuserbyid(@PathVariable("id") String id){
		return UserS.getuserbyid(id);
	}
}

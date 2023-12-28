package com.zproject.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.zproject.demo.model.User;



@Service
public class UserService {
	
	private List<User> store = new ArrayList<>();

	public UserService() {
		
		store.add(new User(UUID.randomUUID().toString(),"Ragib Hasan","ragibhasan006@gmail.com"));
		
		store.add(new User(UUID.randomUUID().toString(),"Abid Hasan","abidhasan006@gmail.com"));
		
		store.add(new User(UUID.randomUUID().toString(),"Ragib","ragib006@gmail.com"));
		
	}
	
	
	
	public List<User> getUsers(){
		
		return this.store;
		
		
	}

}

package com.diego.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diego.workshopmongo.domain.User;
import com.diego.workshopmongo.repository.UserRepository;
import com.diego.workshopmongo.services.exception.ObjectNotFoundEception;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
	
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundEception("Objeto nao encontrado"));
	}

}

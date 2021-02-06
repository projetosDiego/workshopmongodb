package com.diego.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diego.workshopmongo.domain.Post;
import com.diego.workshopmongo.repository.PostRepository;
import com.diego.workshopmongo.services.exception.ObjectNotFoundEception;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundEception("Objeto nao encontrado"));
	}
	
	public List<Post> findByTitle(String text){
		return repo.findByTitleContainingIgnoreCase(text);
	}
}

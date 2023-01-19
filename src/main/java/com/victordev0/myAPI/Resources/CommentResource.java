package com.victordev0.myAPI.Resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.victordev0.myAPI.entities.Comment;
import com.victordev0.myAPI.repositories.CommentRepository;

@RestController
@RequestMapping(value = "/comments")
public class CommentResource {

	@Autowired
	private CommentRepository userRepository;
	
	@GetMapping
	public ResponseEntity<List<Comment>> findAll() {
		
		List<Comment> list = userRepository.findAll();
		return ResponseEntity.ok().body(list);
	}

	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Comment> findById(@PathVariable Long id) {
		
		Comment cat = userRepository.findById(id);
		return ResponseEntity.ok().body(cat);
	}
	
}
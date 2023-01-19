package com.victordev0.myAPI.Resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.victordev0.myAPI.entities.User;
import com.victordev0.myAPI.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		
		List<User> list = userRepository.findAll();
		return ResponseEntity.ok().body(list);
	}

	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		
		User cat = userRepository.findById(id);
		return ResponseEntity.ok().body(cat);
	}
	
}
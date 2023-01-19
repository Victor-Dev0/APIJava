package com.victordev0.myAPI.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.victordev0.myAPI.entities.Comment;

@Component
public class CommentRepository {

	private Map<Long, Comment> map = new HashMap<>();
	
	
	public void save(Comment obj) {
		
		map.put(obj.getId(), obj);
	}

	public Comment findById(Long id) {
		
		return map.get(id);
	}
	
	public List<Comment> findAll() {
		
		return new ArrayList<Comment>(map.values());
	}
}
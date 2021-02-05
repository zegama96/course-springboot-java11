package com.zegama.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zegama.course.entities.User;
import com.zegama.course.repositories.UserRepository;

@Component
public class UserService {
	
	@Autowired
	private UserRepository repository; 
	
	public List<User> findAll(){
		return repository.findAll();				
	}
	
	public User findById(Long id) {
		Optional <User> obj =repository.findById(id);
		return obj.get();
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public User update(Long id, User obj) {
		User entity = repository.getOne(id); 
		update(entity, obj);
		return repository.save(entity);
	}

	private void update(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());		
	}

}

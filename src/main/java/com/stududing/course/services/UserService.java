package com.stududing.course.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.stududing.course.entities.User;
import com.stududing.course.repositories.UserRepository;
import com.stududing.course.services.exceptions.ResourceNotFoundException;

@Service // registra a minha classe como componente do spring
public class UserService {
	@Autowired // para que a injeção de dependencia fique transparente ao DEV
	private UserRepository repository;
	
	public List<User> findAll() { // passando a chamada findAll para o repository.findAll
		return repository.findAll();
	}
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
					
	} 
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public User update(Long id, User obj) {
		User entity = repository.getOne(id);
		updateData(entity, obj);
		return repository.save(entity);
	}
	
	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());		
	}
}

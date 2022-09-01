package com.stududing.course.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.stududing.course.entities.User;
import com.stududing.course.repositories.UserRepository;

@Service // registra a minha classe como componente do spring
public class UserService {
	@Autowired // para que a injeção de dependencia fique transparente ao DEV
	private UserRepository repository;
	
	public List<User> findAll() { // passando a chamada findAll para o repository.findAll
		return repository.findAll();
	}
	public User FindById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}

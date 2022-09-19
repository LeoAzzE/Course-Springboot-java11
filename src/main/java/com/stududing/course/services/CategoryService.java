package com.stududing.course.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.stududing.course.entities.Category;
import com.stududing.course.repositories.CategoryRepository;

@Service // registra a minha classe como componente do spring
public class CategoryService {
	@Autowired // para que a injeção de dependencia fique transparente ao DEV
	private CategoryRepository repository;
	
	public List<Category> findAll() { // passando a chamada findAll para o repository.findAll
		return repository.findAll();
	}
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	} 
}

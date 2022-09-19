package com.stududing.course.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.stududing.course.entities.Product;
import com.stududing.course.repositories.ProductRepository;

@Service // registra a minha classe como componente do spring
public class ProductService {
	@Autowired // para que a injeção de dependencia fique transparente ao DEV
	private ProductRepository repository;
	
	public List<Product> findAll() { // passando a chamada findAll para o repository.findAll
		return repository.findAll();
	}
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	} 
}

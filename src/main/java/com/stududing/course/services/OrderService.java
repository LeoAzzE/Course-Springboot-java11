package com.stududing.course.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.stududing.course.entities.Order;
import com.stududing.course.entities.Order;
import com.stududing.course.repositories.OrderRepository;

@Service // registra a minha classe como componente do spring
public class OrderService {
	@Autowired // para que a injeção de dependencia fique transparente ao DEV
	private OrderRepository repository;
	
	public List<Order> findAll() { // passando a chamada findAll para o repository.findAll
		return repository.findAll();
	}
	public Order FindById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}

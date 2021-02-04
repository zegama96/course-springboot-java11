package com.zegama.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zegama.course.entities.Order;
import com.zegama.course.repositories.OrderRepository;

@Component
public class OrderService {
	
	@Autowired
	private OrderRepository repository; 
	
	public List<Order> findAll(){
		return repository.findAll();				
	}
	
	public Order findById(Long id) {
		Optional <Order> obj =repository.findById(id);
		return obj.get();
	}

}

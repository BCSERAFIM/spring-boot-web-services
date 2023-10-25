package com.bcserafim.cursoUdemySpringBoot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcserafim.cursoUdemySpringBoot.entities.Order;
import com.bcserafim.cursoUdemySpringBoot.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findALL() {
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj =  repository.findById(id);
		return obj.get();
	}
	
}

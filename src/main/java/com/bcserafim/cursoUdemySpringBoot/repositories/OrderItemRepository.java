package com.bcserafim.cursoUdemySpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bcserafim.cursoUdemySpringBoot.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
}

package com.bcserafim.cursoUdemySpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bcserafim.cursoUdemySpringBoot.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

	
}

package com.bcserafim.cursoUdemySpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bcserafim.cursoUdemySpringBoot.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

	
}

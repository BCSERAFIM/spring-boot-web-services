package com.bcserafim.cursoUdemySpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bcserafim.cursoUdemySpringBoot.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}

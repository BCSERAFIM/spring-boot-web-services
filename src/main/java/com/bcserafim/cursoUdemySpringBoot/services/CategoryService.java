package com.bcserafim.cursoUdemySpringBoot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcserafim.cursoUdemySpringBoot.entities.Category;
import com.bcserafim.cursoUdemySpringBoot.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findALL() {
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj =  repository.findById(id);
		return obj.get();
	}
	
}

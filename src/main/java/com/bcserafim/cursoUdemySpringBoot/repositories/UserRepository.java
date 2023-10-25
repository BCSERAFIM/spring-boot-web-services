package com.bcserafim.cursoUdemySpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bcserafim.cursoUdemySpringBoot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}

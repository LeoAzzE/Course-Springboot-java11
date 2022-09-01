package com.stududing.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stududing.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}

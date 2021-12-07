package com.newlifeeuropa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newlifeeuropa.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}

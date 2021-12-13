package com.newlifeeuropa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newlifeeuropa.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}

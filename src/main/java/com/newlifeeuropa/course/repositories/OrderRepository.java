package com.newlifeeuropa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newlifeeuropa.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}

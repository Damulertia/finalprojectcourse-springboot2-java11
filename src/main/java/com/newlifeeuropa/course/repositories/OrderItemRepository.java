package com.newlifeeuropa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newlifeeuropa.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}

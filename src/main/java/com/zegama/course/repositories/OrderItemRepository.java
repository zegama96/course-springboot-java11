package com.zegama.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zegama.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long>  {
	
	
}

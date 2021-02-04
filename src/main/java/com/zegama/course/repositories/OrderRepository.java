package com.zegama.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zegama.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long>  {
	
	
}

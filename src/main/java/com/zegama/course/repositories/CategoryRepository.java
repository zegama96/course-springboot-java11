package com.zegama.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zegama.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long>  {
	
	
}

package com.ciro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciro.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}

package com.ciro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciro.course.entities.Category;
import com.ciro.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}

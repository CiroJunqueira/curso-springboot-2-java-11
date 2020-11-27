package com.ciro.course.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ciro.course.entities.Product;
import com.ciro.course.repositories.ProductRepository;
import java.util.List;
import java.util.Optional;

@Component

public class ProductService {
	
	@Autowired
	private ProductRepository repository;

	public List<Product> findAll(){
		return repository.findAll();
	}	
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}

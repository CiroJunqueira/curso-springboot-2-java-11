package com.ciro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciro.course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}

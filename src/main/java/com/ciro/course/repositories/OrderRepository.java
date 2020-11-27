package com.ciro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciro.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}

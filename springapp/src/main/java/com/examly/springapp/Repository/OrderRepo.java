package com.examly.springapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.Model.Order;


@Repository
public interface OrderRepo extends JpaRepository<Order,Integer> {

}

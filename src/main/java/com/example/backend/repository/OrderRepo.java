package com.example.backend.repository;



import com.example.backend.model.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<OrderModel,String> {

}

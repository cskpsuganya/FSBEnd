package com.example.backend.repository;


import com.example.backend.model.CartModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepo extends JpaRepository<CartModel,Long>{



}

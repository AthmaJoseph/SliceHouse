package com.slice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slice.model.CartItem;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Long>{

}

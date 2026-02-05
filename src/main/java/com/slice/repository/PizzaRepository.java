package com.slice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slice.model.Pizza;
@Repository
public interface PizzaRepository  extends JpaRepository<Pizza, Long>{

}

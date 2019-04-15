package com.cg.trainee.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.trainee.model.Products;

public interface TraineeDao extends JpaRepository<Products, Integer> {

}

package com.cg.trainee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.trainee.model.Products;
@Service("traineeService")

public interface TraineeService  {
	
	public List<Products> findAll();
	
	public void save( Products trainee);
	
	public void delete(Products trainee);
	public  Products findById(Integer id);
	

	
	
	
	
}


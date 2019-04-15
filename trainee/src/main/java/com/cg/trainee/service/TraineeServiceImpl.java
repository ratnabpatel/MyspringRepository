package com.cg.trainee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.trainee.dao.TraineeDao;
import com.cg.trainee.model.Products;
@Service("traineeService")

public class TraineeServiceImpl implements TraineeService {

	@Autowired
	private TraineeDao traineeDao;

	@Override
	public List<Products> findAll() {
		List<Products> traineeslist = traineeDao.findAll();
		return traineeslist;
	}

	@Override
	public void save(Products trainee) {
		traineeDao.save(trainee);

	}

	@Override
	public void delete(Products trainee) {
		traineeDao.delete(trainee);
	}

	@Override
	public Products findById(Integer id) {

		Products trainee=traineeDao.findById(id).get();
		return trainee;
		
	}

}

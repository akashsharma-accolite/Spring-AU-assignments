package com.spring.au.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.au.dao.StudentDao;

@Service
public class StudentService {
	
	@Autowired
	StudentDao studentDao;

	public String getName() {
		return studentDao.getName();
	}
	
}

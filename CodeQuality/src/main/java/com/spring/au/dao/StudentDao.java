package com.spring.au.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public String getName() {
		return jdbcTemplate.queryForObject("select student_name from student where student_id=1", String.class);
	}
	
}

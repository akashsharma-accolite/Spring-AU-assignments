package com.SpringAssignment.SpringAssignment;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Component;
import com.SpringAssignment.SpringAssignment.Employee;

@Component
public class EmployeeDao 
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) 
	{  
	    this.jdbcTemplate = jdbcTemplate;  
	}
	
	public int saveEmployee(Employee employee)
	{
		String query = "insert into employee(id,age,name) values "
				+ "("+employee.getEmpId()+","+employee.getEmpAge()+",'"+employee.getEmpName()+"')";
		return jdbcTemplate.update(query);
	}
	
	
	public Boolean saveStudentUsingPreparedStatement(final Employee employee)
	{
		String query = "insert into employee(id,age,name) values (?,?,?)";
		return jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {

			public Boolean doInPreparedStatement(PreparedStatement ps)
					throws SQLException, DataAccessException 
			{
				ps.setInt(1, employee.getEmpId());
				ps.setInt(2, employee.getEmpAge());
				ps.setString(3, employee.getEmpName());
				return ps.execute();
			}
		});
	}
	
	public List<Employee> listEmployees() 
	{
	      String SQL = "select * from employee";
	      List <Employee> employees = jdbcTemplate.query(SQL, new EmployeeMapper());
	      return employees;
	}
	
	public List<Employee> getEmployeesByResultSetExtractor()
	{
		String query = "select * from employee";
		List <Employee> employees = jdbcTemplate.query(query, new EmployeeExtractor());	         
		return employees;
	}
	
	
}

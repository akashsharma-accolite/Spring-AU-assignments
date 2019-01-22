package com.SpringAssignment.SpringAssignment;

import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.dao.DataAccessException;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.ResultSetExtractor; 
import com.SpringAssignment.SpringAssignment.EmployeeDao.*;

public class EmployeeExtractor implements ResultSetExtractor<List<Employee>> {

	@Override
	public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException 
	{
		List<Employee> list = new ArrayList<Employee>();  
        while(rs.next())
        {  
           Employee employee = new Employee();
           employee.setEmpId(rs.getInt("id"));
           employee.setEmpAge(rs.getInt("age"));
           employee.setEmpName(rs.getString("name"));
           list.add(employee);  
        }  
        return list;
	}

}
  
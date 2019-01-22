package com.SpringAssignment.SpringAssignment;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee> 
{
   public Employee mapRow(ResultSet rs, int rowNum) throws SQLException 
   {
      Employee emp = new Employee();
      emp.setEmpId(rs.getInt("id"));
      emp.setEmpAge(rs.getInt("age"));
      emp.setEmpName(rs.getString("name"));
      return emp;
   }
}

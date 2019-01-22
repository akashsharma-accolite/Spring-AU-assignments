package com.SpringAssignment.SpringAssignment;

import org.springframework.beans.factory.config.AbstractFactoryBean;
import com.SpringAssignment.SpringAssignment.Employee;

public class EmployeeFactoryBean 
{
	private String empName;
	
	
	public String empName() {
		return empName;
	}

	public void setName(String empName) {
		this.empName = empName;
	}

	protected Object createInstance() throws Exception
    {
        Employee employee = new Employee();
        employee.setEmpId(100);
        employee.setEmpAge(35);
        employee.setEmpName(empName);
        return employee;
    }
 
    public Class<Employee> getObjectType() 
    {
        return Employee.class;
    }
}

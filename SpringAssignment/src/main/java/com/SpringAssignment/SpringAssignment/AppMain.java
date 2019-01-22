package com.SpringAssignment.SpringAssignment;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringAssignment.SpringAssignment.EmployeeDao.*;

public class AppMain {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Start: Using Spring: ********");
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringPackage/applicationContext.xml");
		
		EmployeeDao jdbcTemplateDao=(EmployeeDao)applicationContext.getBean(EmployeeDao.class);
//		Employee emp=new Employee();
//		emp.setEmpAge(21);
//		emp.setEmpId(1);
//		emp.setEmpName("Akash");
//		//System.out.println(jdbcTemplateDao.saveEmployee(emp));
//		
//		Employee e1=new Employee(2,28,"Nimmi");
//		//System.out.println(jdbcTemplateDao.saveStudentUsingPreparedStatement(e1));
//		Employee e2=new Employee(6,22,"abcd");
//		Employee e3=new Employee(7,23,"wxyz");
//		Employee e4=new Employee(8,24,"JDKroviddi");
//		System.out.println(jdbcTemplateDao.saveStudentUsingPreparedStatement(e2));
//		System.out.println(jdbcTemplateDao.saveStudentUsingPreparedStatement(e3));
//		System.out.println(jdbcTemplateDao.saveStudentUsingPreparedStatement(e4));
		
		 System.out.println("------Listing Multiple Records using Row Mapper--------" );
	      List<Employee> employees = jdbcTemplateDao.listEmployees();
	      
	      for (Employee e : employees) 
	      {
	         System.out.print("ID : " + e.getEmpId() );
	         System.out.print(", Name : " + e.getEmpName() );
	         System.out.println(", Age : " + e.getEmpAge());
	      }  
	      
	      System.out.println("--------Listing Multiple Records using Result Set Extractor---------");
	      List<Employee>empList=jdbcTemplateDao.getEmployeesByResultSetExtractor();
	      for(Employee e : empList)
	      {
				System.out.println("ID: "+e.getEmpId()+" Age: "+e.getEmpAge()+" Name: "+e.getEmpName());
	      }
	      
	      System.out.println("");
	      
	      System.out.println("Using Factory method");
	      Employee employee = (Employee) applicationContext.getBean("emp");
	      employee.printMessage();
		
	}

}

package com.SpringAssignment.SpringAssignment;

public class Employee 
{
	
	static final Employee innerEmployee = new Employee();
	
	//factory Method
	public static Employee getEmployee()
	{
		System.out.println("Inside Factory Method");
		return innerEmployee;
	}
	
	public int empId,empAge;
	public String empName;
	
	public Employee()
	{
		
	}
	
	public Employee(int id,int age,String name)
	{
		this.empId=id;
		this.empAge=age;
		this.empName=name;
	}
	public int getEmpId() 
	{
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void printMessage()
	{
		System.out.println("This is an Employee from factory method.");
	}
	
	
	
}

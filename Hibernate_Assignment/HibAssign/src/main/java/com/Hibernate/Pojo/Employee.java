package com.Hibernate.Pojo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee 
{
	@Id
	@Column(name="empId")
	public Integer empId;

	@Column(name="empName")
	public String empName;

	@Column(name="empAge")
	public Integer empAge;
	
	@Column(name="compId")
	public Integer compId;

	public Integer getEmpId() {
		return empId;
	}
	public Employee()
	{
		
	}
	
	public Employee(int id,int age,String name,int compid)
	{
		this.empId=id;
		this.empAge=age;
		this.empName=name;
		this.compId=compid;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getEmpAge() {
		return empAge;
	}

	public void setEmpAge(Integer empAge) {
		this.empAge = empAge;
	}

	public Integer getCompId() {
		return compId;
	}

	public void setCompId(Integer compId) {
		this.compId = compId;
	}
	
	public String toString() 
	{
		return "EMP ID: "+ this.empId+", EMP NAME: "+this.empName+", EMP AGE:"+this.empAge+" | ";
	}
	

	//@OneToMany(mappedBy="studentId", fetch=FetchType.EAGER) public List<Course> courses;
	
	
}
